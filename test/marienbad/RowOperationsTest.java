package marienbad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class RowOperationsTest {

    @Test
    public void testNumNonZeroRowsInitial() {

        
        final MarienbadBoard initBoard = new MarienbadBoard();
        
        int number=RowOperations.getNumberNonZeroRows(initBoard);
        assertTrue("expected initial board 1,3,5,7", number==4);
        
        int thirdRow = initBoard.rowsOfSticks.get(2);
        assertEquals(thirdRow,5);
    }
    
    @Test
    public void testNumNonZeroRowsOneFirst() {

        
        final List<Integer> initList = Arrays.asList(1,0,0,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        int number=RowOperations.getNumberNonZeroRows(initBoard);
        assertTrue("expected initial board 1,0,0,0", number==1);
        
        int firstRow = initBoard.rowsOfSticks.get(0);
        assertEquals(firstRow,1);
        int thirdRow = initBoard.rowsOfSticks.get(2);
        assertEquals(thirdRow,0);
    }
    
    @Test
    public void testNumNonZeroRowsAllZero() {

        
        final List<Integer> initList = Arrays.asList(0,0,0,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        int number=RowOperations.getNumberNonZeroRows(initBoard);
        assertTrue("expected initial board 1,0,0,0", number==0);
        
        int firstRow = initBoard.rowsOfSticks.get(0);
        assertEquals(firstRow,0);
        int thirdRow = initBoard.rowsOfSticks.get(2);
        assertEquals(thirdRow,0);
    }
    
    @Test
    public void testNumNonZeroRowsTwoMiddle() {

        
        final List<Integer> initList = Arrays.asList(0,1,2,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        int number=RowOperations.getNumberNonZeroRows(initBoard);
        assertTrue("expected initial board 1,0,0,0", number==2);
        
        int firstRow = RowOperations.getSticksInRow(initBoard,1);
        assertEquals(firstRow,0);
        int secondRow = initBoard.rowsOfSticks.get(1);
        assertEquals(secondRow,1);
        int thirdRow = RowOperations.getSticksInRow(initBoard,3);
        assertEquals(thirdRow,2);
        int fourthRow = initBoard.rowsOfSticks.get(3);
        assertEquals(0,fourthRow);
    }
    
    @Test
    public void testFindOrder() {

        final MarienbadBoard initBoard = new MarienbadBoard();
        
        int smallest=RowOperations.getSmallestNonZero(initBoard);
        assertEquals(1,smallest);
        int smallestRow = RowOperations.getMinRow(initBoard);
        assertEquals(1,smallestRow);
        
        int secondSmallest=RowOperations.getSecondSmallestNonZero(initBoard);
        assertEquals(3,secondSmallest);
        int secondSmallestRow = RowOperations.getSecondSmallestRow(initBoard);
        assertEquals(2,secondSmallestRow);

        int maxSticks=RowOperations.getMaxStick(initBoard);
        assertEquals(7,maxSticks);
        int maxRow = RowOperations.getMaxRow(initBoard);
        assertEquals(4,maxRow);
    }
    
    @Test
    public void testFindOrderWithMiddleZero() {

        final List<Integer> initList = Arrays.asList(3,0,0,7);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        int smallest=RowOperations.getSmallestNonZero(initBoard);
        assertEquals(3,smallest);
        int smallestRow = RowOperations.getMinRow(initBoard);
        assertEquals(1,smallestRow);
        
        int secondSmallest=RowOperations.getSecondSmallestNonZero(initBoard);
        assertEquals(7,secondSmallest);
        int secondSmallestRow = RowOperations.getSecondSmallestRow(initBoard);
        assertEquals(4,secondSmallestRow);

        int maxSticks=RowOperations.getMaxStick(initBoard);
        assertEquals(7,maxSticks);
        int maxRow = RowOperations.getMaxRow(initBoard);
        assertEquals(4,maxRow);
    }
    
    @Test
    public void testReplace() {

        final MarienbadBoard initBoard = new MarienbadBoard();
        
        MarienbadBoard takeOneFromRowOne=RowOperations.replaceRow(initBoard, 1, 1);
        MarienbadBoard removeRowOne=RowOperations.removeRow(initBoard, 1);
        
        int firstRow = RowOperations.getSticksInRow(takeOneFromRowOne,1);
        assertEquals(0, firstRow);
        List<Integer> rest = Arrays.asList(0,3,5,7);
        assertEquals(rest,takeOneFromRowOne.rowsOfSticks);
        
        assertEquals(rest,removeRowOne.rowsOfSticks);
        
        MarienbadBoard takeOneFromRowTwo=RowOperations.replaceRow(initBoard, 2, 1);
        MarienbadBoard removeRowTwo=RowOperations.removeRow(initBoard, 2);
        
        List<Integer> restOneFromTwo = Arrays.asList(1,2,5,7);
        assertEquals(restOneFromTwo,takeOneFromRowTwo.rowsOfSticks);
        
        List<Integer> restRemoveTwo = Arrays.asList(1,0,5,7);
        assertEquals(restRemoveTwo,removeRowTwo.rowsOfSticks);
        
        
        MarienbadBoard take3FromRow3=RowOperations.replaceRow(initBoard, 3, 3);
        MarienbadBoard removeRowThree=RowOperations.removeRow(initBoard, 3);
        
        List<Integer> rest3From3 = Arrays.asList(1,3,2,7);
        assertEquals(rest3From3,take3FromRow3.rowsOfSticks);
        
        List<Integer> restRemoveThree = Arrays.asList(1,3,0,7);
        assertEquals(restRemoveThree,removeRowThree.rowsOfSticks);
        
        
        MarienbadBoard take3FromRow4=RowOperations.replaceRow(initBoard, 4, 3);
        MarienbadBoard removeRowFour=RowOperations.removeRow(initBoard, 4);
        
        List<Integer> rest3From4 = Arrays.asList(1,3,5,4);
        assertEquals(rest3From4,take3FromRow4.rowsOfSticks);
        
        List<Integer> restRemoveFour = Arrays.asList(1,3,5,0);
        assertEquals(restRemoveFour,removeRowFour.rowsOfSticks);

    }
    
    
    @Test
    public void testMinRow4502() {

        final List<Integer> initList = Arrays.asList(4,5,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        int minRow = RowOperations.getMinRow(initBoard);
        assertEquals(4,minRow);
    }
    
    @Test
    public void testTwoSameRows1335() {

        final List<Integer> initList = Arrays.asList(1,3,3,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        List<Integer> twoRows = Arrays.asList(2,3);
        List <Integer> twoRowsIndicies = RowOperations.getTwoSameRows(initBoard);
        assertEquals(twoRows,twoRowsIndicies);
        assertTrue(RowOperations.twoRowsAreSame(initBoard));
    }
    
    @Test
    public void testTwoSameRows2245() {

        final List<Integer> initList = Arrays.asList(2,2,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        List<Integer> twoRows = Arrays.asList(1,2);
        List <Integer> twoRowsIndicies = RowOperations.getTwoSameRows(initBoard);
        assertEquals(twoRows,twoRowsIndicies);
        assertTrue(RowOperations.twoRowsAreSame(initBoard));
    }
    
    
    @Test
    public void testTwoSameRows4522() {

        final List<Integer> initList = Arrays.asList(4,5,2,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        List<Integer> twoRows = Arrays.asList(3,4);
        List <Integer> twoRowsIndicies = RowOperations.getTwoSameRows(initBoard);
        assertEquals(twoRows,twoRowsIndicies);
        assertTrue(RowOperations.twoRowsAreSame(initBoard));
    }
    
    @Test
    public void testTwoSameRows2244() {

        final List<Integer> initList = Arrays.asList(2,2,4,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        List<Integer> twoRows = Arrays.asList(1,2);
        List <Integer> twoRowsIndicies = RowOperations.getTwoSameRows(initBoard);
        assertEquals(twoRows,twoRowsIndicies);
        assertTrue(RowOperations.twoRowsAreSame(initBoard));
    }
    
    @Test
    public void testNoTwoSameRows2345() {

        final List<Integer> initList = Arrays.asList(2,3,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);


        assertFalse(RowOperations.twoRowsAreSame(initBoard));
    }
    
    
    @Test
    public void testNoTwoSameRows1347() {

        final List<Integer> initList = Arrays.asList(1,3,4,7);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);

        assertFalse(RowOperations.twoRowsAreSame(initBoard));
    }
    
    @Test
    public void testTwoSameRows0347() {

        final List<Integer> initList = Arrays.asList(0,3,4,7);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        assertFalse(RowOperations.twoRowsAreSame(initBoard));
    }
    
    
    @Test
    public void testNumberRows0013() {

        final List<Integer> initList = Arrays.asList(0,0,1,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
         
        int numRows = RowOperations.getNumberNonZeroRows(initBoard);
        assertEquals(2,numRows);
    }
    
    @Test
    public void testGetMinRow0013() {

        final List<Integer> initList = Arrays.asList(0,0,1,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
         
        int minRow = RowOperations.getMinRow(initBoard);
        assertEquals(3,minRow);
    }

}
