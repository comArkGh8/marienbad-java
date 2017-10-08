package marienbad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ChoiceOperationsTest {
    
    @Test
    public void testChoice5() {

        
        final List<Integer> initList = Arrays.asList(0,0,0,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceOne(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,4);
        assertEquals(bestChoice, cChoice);
    }
    
    
    @Test
    public void testLoser22() {
        final List<Integer> initList = Arrays.asList(0,2,2,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceTwo(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1);
        assertEquals(bestChoice, loseChoice);
    }
    
    @Test
    public void testLoser44() {
        final List<Integer> initList = Arrays.asList(4,0,0,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceTwo(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, loseChoice);
    }
    
    @Test
    public void testChoice51() {

        
        final List<Integer> initList = Arrays.asList(0,1,0,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceTwo(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,5);
        assertEquals(bestChoice, cChoice);
    }
    
    
    @Test
    public void testChoice53() {

        
        final List<Integer> initList = Arrays.asList(0,3,0,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceTwo(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
    }
    
    
    
    
    @Test
    public void testLoser111() {

        
        final List<Integer> initList = Arrays.asList(0,1,1,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testLoser321() {

        
        final List<Integer> initList = Arrays.asList(3,1,2,0);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testChoiceN11() {

        
        final List<Integer> initList = Arrays.asList(0,1,2,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoiceN21() {

        
        final List<Integer> initList = Arrays.asList(0,1,2,5);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice541() {

        
        final List<Integer> initList = Arrays.asList(5,1,0,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testChoice741() {

        
        final List<Integer> initList = Arrays.asList(0,7,4,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice751() {

        
        final List<Integer> initList = Arrays.asList(0,7,5,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,3);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice632() {

        
        final List<Integer> initList = Arrays.asList(3,0,6,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,5);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice642() {

        
        final List<Integer> initList = Arrays.asList(6,2,0,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    
    @Test
    public void testChoice542() {

        
        final List<Integer> initList = Arrays.asList(4,5,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice742() {

        
        final List<Integer> initList = Arrays.asList(4,7,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice652() {

        
        final List<Integer> initList = Arrays.asList(5,6,0,2);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice543() {

        
        final List<Integer> initList = Arrays.asList(5,4,0,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice0133() {

        
        final List<Integer> initList = Arrays.asList(0,1,3,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    
    @Test
    public void testChoice643() {

        
        final List<Integer> initList = Arrays.asList(6,4,0,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceThree(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice11nk() {

        
        final List<Integer> initList = Arrays.asList(3,1,5,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,2); 
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice22nk() {

        
        final List<Integer> initList = Arrays.asList(2,2,5,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,4); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice3311() {

        
        final List<Integer> initList = Arrays.asList(3,3,1,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice6321() {

        
        final List<Integer> initList = Arrays.asList(2,3,6,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,6); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice5421() {

        
        final List<Integer> initList = Arrays.asList(2,4,5,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,2); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice6421() {

        
        final List<Integer> initList = Arrays.asList(2,4,6,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice6431() {

        
        final List<Integer> initList = Arrays.asList(6,3,4,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice6521() {

        
        final List<Integer> initList = Arrays.asList(2,6,5,1);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice2333() {

        
        final List<Integer> initList = Arrays.asList(2,3,3,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        
        List<Integer> bestChoice = Arrays.asList(4,1); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice4332() {

        
        final List<Integer> initList = Arrays.asList(2,3,3,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice2346() {

        
        final List<Integer> initList = Arrays.asList(2,3,6,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,3); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice2347() {

        
        final List<Integer> initList = Arrays.asList(2,3,7,4);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoiceFour(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,2); 
        assertEquals(bestChoice, cChoice);
    }
    
}
