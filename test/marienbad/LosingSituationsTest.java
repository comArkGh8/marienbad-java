package marienbad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LosingSituationsTest {

    
    /////////////////////////////////////////
    ////////  2 rows        /////////////////
    /////////////////////////////////////////
    
    @Test
    public void testTwoRowOnesWins() {

        
        final List<Integer> initList = Arrays.asList(0,1,1,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseTwoRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    @Test
    public void testTwoRowSameLoses() {

        final List<Integer> initList = Arrays.asList(0,2,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        boolean lose = LosingSituations.caseTwoRows(initBoard);
        assertTrue("expected to lose", lose);
        
    }
    
    @Test
    public void testTwoRowDiffWins() {

        final List<Integer> initList = Arrays.asList(0,2,0,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        boolean win = LosingSituations.caseTwoRows(initBoard);
        assertFalse("expected to win", win);
        
    }
    
    
    @Test
    public void testTwoRowDiff13Wins() {

        final List<Integer> initList = Arrays.asList(5,0,0,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        boolean win = LosingSituations.caseTwoRows(initBoard);
        assertFalse("expected to win", win);
        
    }
    
    
    
    
    /////////////////////////////////////////
    ////////  3 rows        /////////////////
    /////////////////////////////////////////
    
    // recall:
    // losing situations of 3 rows are:
    //  1,1,1
    //  3,2,1
    //  5,4,1
    //  6,4,2
    //  7,5,2
    //  7,4,3
    //  6,5,3
    
    @Test
    public void testThreeRowOnesLoses() {

        
        final List<Integer> initList = Arrays.asList(0,1,1,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    @Test
    public void testThreeRow2OnesWins() {

        
        final List<Integer> initList = Arrays.asList(0,1,7,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    @Test
    public void testThreeRow321Loses() {

        
        final List<Integer> initList = Arrays.asList(3,1,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    @Test
    public void testThreeRow322Wins() {

        
        final List<Integer> initList = Arrays.asList(3,2,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    @Test
    public void testThreeRow541Loses() {

        
        final List<Integer> initList = Arrays.asList(1,0,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    
    @Test
    public void testThreeRow442Wins() {

        
        final List<Integer> initList = Arrays.asList(4,2,4,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    @Test
    public void testThreeRow542Wins() {

        
        final List<Integer> initList = Arrays.asList(2,0,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    @Test
    public void testThreeRow521Wins() {

        
        final List<Integer> initList = Arrays.asList(2,0,1,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    
    
    @Test
    public void testThreeRow642Loses() {

        
        final List<Integer> initList = Arrays.asList(2,0,4,6);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    @Test
    public void testThreeRow752Loses() {

        
        final List<Integer> initList = Arrays.asList(7,2,0,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    @Test
    public void testThreeRow743Loses() {

        
        final List<Integer> initList = Arrays.asList(0,3,4,7);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    
    @Test
    public void testThreeRow653Loses() {

        
        final List<Integer> initList = Arrays.asList(0,3,6,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseThreeRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    @Test
    public void testThreeRow652Wins() {

        
        final List<Integer> initList = Arrays.asList(2,0,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    
    @Test
    public void testThreeRow751Wins() {

        
        final List<Integer> initList = Arrays.asList(1,5,7,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }

    @Test
    public void testThreeRow543Wins() {

        
        final List<Integer> initList = Arrays.asList(3,0,4,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean win = LosingSituations.caseThreeRows(initBoard);
        assertFalse("expected to win", win);
        

    }
    
    
    @Test
    public void testThreeRow7531Loses() {

        
        final List<Integer> initList = Arrays.asList(7,5,3,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        boolean lose = LosingSituations.caseFourRows(initBoard);
        assertTrue("expected to lose", lose);
        

    }
    
    
    
    
}
