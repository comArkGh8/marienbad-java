package marienbad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MarienbadBoard {
    
    public List<Integer> rowsOfSticks;

    
    /* Rep invariant: 
     *    rowsOfSticks.length =4
     */
    
    /**
     * Make an initial board
     */
    
    
    public MarienbadBoard() {
        List<Integer> initialBoard = Arrays.asList(1,3,5,7);
        this.rowsOfSticks = initialBoard;
    }


    /**
     * Make a Board.
     * input are the no. of sticks in the four rows (as a list)
     */
    
    public MarienbadBoard(List<Integer> stickList) {
        this.rowsOfSticks = stickList;
    }

    
    public MarienbadBoard change(int row, int sticks){
        List<Integer> originalList = this.rowsOfSticks;
        Integer[] stickArray= (Integer[]) originalList.toArray();
        stickArray[row-1]=originalList.get(row-1) -sticks;
        // now create new list of rows with updated sticks
        List<Integer> updatedSticks = Arrays.asList(stickArray);
        this.rowsOfSticks = updatedSticks;
        return this;
    }



}
