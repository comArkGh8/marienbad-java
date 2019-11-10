package marienbad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;




public class RowOperations {
    
    /**
     * 
     * @param stick_array - will already have zeros removed
     * @return
     */
    public static int getNumberNonZeroRows(int[] stick_array){
        return stick_array.length;
    }
    
    
    /**
     * 
     * @param board - input board
     * @return sorted Array of non-zeros in ascending order
     */
    public static HashMap<Integer,Integer> sortedByIncreasingSticks(MarienbadBoard board){
        
        HashMap<Integer, Integer> sortedSticksMap = board.rowsOfSticks
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey, 
                                Map.Entry::getValue, 
                                (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        // change the board (it is mutable)
        board.rowsOfSticks = sortedSticksMap;
        
        return sortedSticksMap;
    }
    
    /**
     * gets the minimum (non-zero) number
     * of sticks in a single row 
     * among all 4 rows
     */
    
    public static int getSmallestNonZero(MarienbadBoard board){
        ArrayList<Integer> sortIt = sortedNonZeroBoard(board);  
        
        int index =0;
        while (sortIt.get(index)==0){
            index+=1;
        }
        int minStick = sortIt.get(index);
        return minStick;
    }
    
    /**
     * gets the row number (1-4)
     * in which lie the minimum (non-zero!!!) number
     * of sticks 
     */
    
    public static int getMinRow(MarienbadBoard board){
        int minRow = 1;
        while (board.rowsOfSticks.get(minRow-1)==0){
            minRow+=1;
        }
        for (int index=0;index<4;index++){
            
            if (board.rowsOfSticks.get(index)!=0 &&
                    board.rowsOfSticks.get(index)<board.rowsOfSticks.get(minRow-1)){
                minRow=index+1;
            }
        }
        return minRow;
    }
    
    /**
     * assumes at least two non-zero rows
     * @param board
     * @return the second smallest number of sticks
     */
    public static int getSecondSmallestNonZero(MarienbadBoard board){
        ArrayList<Integer> sortIt = sortedNonZeroBoard(board);  
        int index =0;
        while (sortIt.get(index)==0){
            index+=1;
        }
        int secondStick = sortIt.get(index+1);
        return secondStick;
    }
    
    /**
     * gets the row number (1-4)
     * in which lie the second smallest number
     * of sticks 
     */
    
    public static int getSecondSmallestRow(MarienbadBoard board){
        // algorithm: throw out smallest 
        // then feed new game into getMinRow
        
        int minRow = getMinRow(board);
        // make new game without minimum
        MarienbadBoard boardWithoutSmallest = removeRow(board, minRow);

        int secRow = getMinRow(boardWithoutSmallest);
        
        return secRow;
    }
    
    /**
     * assumes at least three non-zero rows
     * @param board
     * @return the second smallest number of sticks
     */
    
    public static int getSecondHighestNonZero(MarienbadBoard board){
        ArrayList<Integer> sortIt = sortedNonZeroBoard(board);  
        int index =0;
        while (sortIt.get(index)==0){
            index+=1;
        }
        int thirdStick = sortIt.get(index+2);
        return thirdStick;
    }
    
    /**
     * gets the row number (1-4)
     * in which lie the second highest number
     * of sticks 
     */
    
    public static int getSecondHighestRow(MarienbadBoard board){
        // algorithm: throw out smallest and second smallest
        // then feed new game into getMinRow
        
        int minRow = getMinRow(board);
        // make new game without minimum
        MarienbadBoard boardWithoutSmallest = removeRow(board, minRow);

        int secRow = getMinRow(boardWithoutSmallest);
        // make new game without second
        MarienbadBoard boardWithoutSecond = removeRow(board, secRow);
        
        int thirdRow = getMinRow(boardWithoutSecond);
        
        return thirdRow;
    }
    
    
    /**
     * gets the maximum number
     * of sticks in a single row
     * among all 4 rows
     */
    
    public static int getMaxStick(MarienbadBoard board){
        ArrayList<Integer> sortIt = sortedNonZeroBoard(board);        
        int length = sortIt.size();  
        int maxStick = sortIt.get(length-1);
        return maxStick;
    }
    
    /**
     * gets the row number (1-4)
     * in which lie the maximum number
     * of sticks 
     */
    
    public static int getMaxRow(MarienbadBoard board){
        int maxRow = 4;
        for (int index=0;index<3;index++){
            if (board.rowsOfSticks.get(index)>board.rowsOfSticks.get(maxRow-1)){
                maxRow=index+1;
            }
        }
        return maxRow;
    }
    
    /**
     * 
     * @param board
     * @return array of two equal rows (if exist)
     * or the pair (0,0) otherwise
     */
    
    public static List<Integer> getTwoSameRows(MarienbadBoard board){
        for (int indexI=0;indexI<4;indexI++){
            for (int indexJ=indexI+1;indexJ<4;indexJ++){
                if (board.rowsOfSticks.get(indexI)==board.rowsOfSticks.get(indexJ)){
                    List<Integer> twoRows=Arrays.asList(indexI+1,indexJ+1);
                    return twoRows;
                }
            }
        }
        return Arrays.asList(0,0);
    }
    
    /**
     * 
     * @param board has no zero rows (essential is no two zero rows)
     * @return true if there are two rows which are same
     * false otherwise
     */
    
    public static boolean twoRowsAreSame(MarienbadBoard board){
        List<Integer> defaultList = Arrays.asList(0,0);
        
        if (getTwoSameRows(board).equals(defaultList)){
            return false;
        }
        
        return true;
    }
    
    
    
    /**
     * 
     * @param gameBoard - given current board
     * @param row - number of row (1-4) to be changed
     * @param numberToTake - the number of sticks wanted to deduct
     * @return - the updated game board
     */
    
    public static MarienbadBoard replaceRow(MarienbadBoard gameBoard, int row, int numberToTake){
        // index corresponding to chosen row
        int index = row -1;
        List<Integer> updatedBoardRows = new ArrayList<Integer>();
        int updatedRowSticks = gameBoard.rowsOfSticks.get(index) - numberToTake;
        // fill in the updated rows
        for (int i=0;i<4;i++){
            if (i==index){
                updatedBoardRows.add(updatedRowSticks);
            }
            else{
                updatedBoardRows.add(gameBoard.rowsOfSticks.get(i));
            }
        }
        MarienbadBoard updatedGame = new MarienbadBoard(updatedBoardRows);
        return updatedGame;
    }
    
    /**
     * special case of replace row, replace with 0
     * @param gameBoard
     * @param row
     * @return
     */
    
    public static MarienbadBoard removeRow(MarienbadBoard gameBoard, int row){
        int numberOfSticksInRow = gameBoard.rowsOfSticks.get(row-1);
        MarienbadBoard updatedGame = replaceRow(gameBoard, row, numberOfSticksInRow);
        return updatedGame;
    }

}
