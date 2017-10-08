package marienbad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import marienbad.MarienbadBoard;
import marienbad.RowOperations;

public class ChoiceOperations {
    
    /**
     * 
     * @param gameBoard - assumes only one non zero row
     * @return - best choice if not 1
     */
    public static List<Integer> bestChoiceOne (MarienbadBoard gameBoard){
        // strategy:
        // returns just one stick
        
        int maxRow = RowOperations.getMaxRow(gameBoard);
        int maxSticks = RowOperations.getMaxStick(gameBoard);
        
        int sticksToTake=maxSticks-1;
        
        List<Integer> choiceList = Arrays.asList(maxRow,sticksToTake); 
        return choiceList;
        
    }
    
    
    /**
     * 
     * @param gameBoard - assumes exactly 2 non zero rows
     * @return - best choice for two rows
     */
    
    public static List<Integer> bestChoiceTwo (MarienbadBoard gameBoard){
        // strategy:
        // if min = 1 then remove row
        // if max and min same choose 1 from max 
        // else make of form n,n
        
        int maxRow = RowOperations.getMaxRow(gameBoard);
        
        int maxSticks = RowOperations.getMaxStick(gameBoard);
        int minSticks = RowOperations.getSmallestNonZero(gameBoard);
        
        int sticksToTake;
        
        if (minSticks==1){
            sticksToTake = maxSticks;
            List<Integer> choiceList = Arrays.asList(maxRow,sticksToTake); 
            return choiceList;
        }
        
        if (maxSticks==minSticks){
            List<Integer> choiceList = Arrays.asList(maxRow,1);
            return choiceList;
        }
        else{
            sticksToTake = maxSticks-minSticks;
            List<Integer> choiceList = Arrays.asList(maxRow,sticksToTake); 
            return choiceList;
        }
        
    }
    

    /**
     * 
     * @param gameBoard assumes has exactly three non-zero rows
     * @return a list of length 2 with (row, number to take)
     */
    public static List<Integer> bestChoiceThree (MarienbadBoard gameBoard){
        // strategy:
        // if a loss choose a random (max-1) else...
        // check if row removal leads to win (loss for opponent)
        // if not reduce to one of the losses for three rows
        
        
        
        int maxRow = RowOperations.getMaxRow(gameBoard);
        int minRow = RowOperations.getMinRow(gameBoard);
        int secRow = RowOperations.getSecondSmallestRow(gameBoard);
        
        int maxSticks = RowOperations.getMaxStick(gameBoard);
        int sticksToTake;
        List<Integer> choiceList = Arrays.asList(maxRow,maxSticks); 
        
        
        if (LosingSituations.caseThreeRows(gameBoard)) {
            choiceList = Arrays.asList(maxRow,1);
            return choiceList;
        }
        
        else{
            // check if can reduce it to two rows
            for (int row=1; row<=4; row++){
                MarienbadBoard removeRowGame = RowOperations.removeRow(gameBoard,row);
                // first make certain a non-zero row was removed
                if (RowOperations.getNumberNonZeroRows(removeRowGame)==2){
                    if (LosingSituations.caseTwoRows(removeRowGame)){
                        sticksToTake = RowOperations.getSticksInRow(gameBoard,row);
                        choiceList = Arrays.asList(row,sticksToTake);
                        return choiceList;
                    }
                }

            }
            // if cant reduce to two rows need to go case by case 
            
            int minNumber = RowOperations.getSmallestNonZero(gameBoard);
            int secondSmallest = RowOperations.getSecondSmallestNonZero(gameBoard);
            
            List<Integer> numbers = Arrays.asList(minNumber,secondSmallest,maxSticks);
            
            switch (minNumber) {
            case 1:  
                switch(secondSmallest) {
                    case 1: 
                        sticksToTake = maxSticks -1;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    
                    case 2: if (maxSticks >3){
                        sticksToTake = maxSticks -3;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    }
                    
                    case 3: 
                        sticksToTake = maxSticks -2;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    
                        
                    case 4:
                        sticksToTake = maxSticks -5;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    
                    case 5:
                        sticksToTake = maxSticks -4;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    
                }
            
            case 2: 
                switch(secondSmallest) {
                    case 3:
                        sticksToTake = maxSticks -1;
                        choiceList = Arrays.asList(maxRow,sticksToTake);
                        return choiceList;
                    
                    case 4: 
                        switch(maxSticks) {
                            case 5: 
                                // sticksToTake = 2 - 1
                                sticksToTake = 1;
                                choiceList = Arrays.asList(minRow,sticksToTake);
                                return choiceList;
                                
                            case 7:
                                // sticksToTake = 7-6
                                sticksToTake = 1;
                                choiceList = Arrays.asList(maxRow,sticksToTake);
                                return choiceList;
                        }
                        
                    case 5:
                        if (maxSticks == 6){
                            // change 5 to 4; sticksToTake = 5-4
                            sticksToTake = 1;
                            choiceList = Arrays.asList(secRow,sticksToTake);
                            return choiceList;
                        }
                }
                
            case 3:
                switch(secondSmallest) {
                    case 4:
                        switch(maxSticks) {
                        case 5: 
                            // change 3 to 1
                            // sticksToTake = 3 - 1
                            sticksToTake = 2;
                            choiceList = Arrays.asList(minRow,sticksToTake);
                            return choiceList;
                            
                        case 6:
                            // sticksToTake = 3-2
                            sticksToTake = 1;
                            choiceList = Arrays.asList(minRow,sticksToTake);
                            return choiceList;
                    }
                        
                    case 5: 
                        // only winning is 7,5,3 -> 7,5,2
                        sticksToTake = 1;
                        choiceList = Arrays.asList(minRow,sticksToTake);
                        return choiceList;
                }        
           
        }
            
        
        // end of else    
        }
        
        return choiceList;
    }
    
    
    
    public static List<Integer> bestChoiceFour (MarienbadBoard gameBoard){
        // strategy:
        // if a loss choose a random (max-1) else...
        // check if row removal leads to win (loss for opponent)
        // if not reduce to one of the losses for three rows
        
        
        int maxRow = RowOperations.getMaxRow(gameBoard);

        
        int maxSticks = RowOperations.getMaxStick(gameBoard);
        int sticksToTake;
        List<Integer> choiceList = Arrays.asList(maxRow,maxSticks); 
        
        int minSticks = RowOperations.getSmallestNonZero(gameBoard);
        int secSticks = RowOperations.getSecondSmallestNonZero(gameBoard);
        int thirdSticks = RowOperations.getSecondHighestNonZero(gameBoard);
        
        
        
        if (LosingSituations.caseFourRows(gameBoard)) {
            choiceList = Arrays.asList(maxRow,1);
            return choiceList;
        }
        
        else{
            // check if can reduce it to three rows
            for (int row=1; row<=4; row++){
                MarienbadBoard removeRowGame = RowOperations.removeRow(gameBoard,row);
                // removeRowGame must have three non-zero rows automatically
                if (LosingSituations.caseThreeRows(removeRowGame)){
                    sticksToTake = RowOperations.getSticksInRow(gameBoard,row);
                    choiceList = Arrays.asList(row,sticksToTake);
                    return choiceList;
                }
            }
            // if cant reduce to three rows need to go case by case 
            
            // first if there are two rows equal 
            // then change to min min k k
            if (RowOperations.twoRowsAreSame(gameBoard)){
                List<Integer> twoSameRows = RowOperations.getTwoSameRows(gameBoard);
                ArrayList<Integer> twoSameArray= new ArrayList(twoSameRows);
                ArrayList<Integer> otherRows = new ArrayList(Arrays.asList(1,2,3,4));
                otherRows.removeAll(twoSameArray);
                int firstOther = otherRows.get(0);
                int secondOther = otherRows.get(1);
                int difference = gameBoard.rowsOfSticks.get(firstOther-1)-gameBoard.rowsOfSticks.get(secondOther-1);
                sticksToTake = Math.abs(difference);
                
                if (difference > 0){
                    choiceList = Arrays.asList(firstOther,sticksToTake);
                }
                else{
                    choiceList = Arrays.asList(secondOther,sticksToTake);
                }
            }
            
            switch (minSticks){
            case 1:
                switch (secSticks){
                case 3:
                    switch (thirdSticks){
                    case 4:
                        // max =7, all other cases handled by losing in 3 rows...
                        if (maxSticks == 7){
                            sticksToTake = 1;
                            choiceList = Arrays.asList(maxRow,sticksToTake);
                            return choiceList;
                        }
                    }
                }
                

                
            }
            
            
            
        }
        
        
        return choiceList;
    }
    
}
