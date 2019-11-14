package marienbad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class ChoiceOperationsTest {
    
    @Test
    public void testChoice5() {

        
        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
                                            put(1, 5);
                                            put(2, 0);
                                            put(3, 0);
                                            put(4, 0);
                                        }};
        
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,4);
        assertEquals(bestChoice, cChoice);
    }
    
    
    @Test
    public void testLoser22() {
        
        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 2);
            put(3, 2);
            put(4, 0);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,1);
        assertEquals(bestChoice, loseChoice);
    }
    
    @Test
    public void testLoser44() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 4);
            put(2, 0);
            put(3, 0);
            put(4, 4);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, loseChoice);
    }
    
    @Test
    public void testChoice51() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 1);
            put(3, 0);
            put(4, 5);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,5);
        assertEquals(bestChoice, cChoice);
    }
    
    
    @Test
    public void testChoice53() {

        
        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 3);
            put(3, 0);
            put(4, 5);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
    }
    
    
    
    
    @Test
    public void testLoser111() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 1);
            put(3, 1);
            put(4, 1);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testLoser321() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 1);
            put(3, 2);
            put(4, 0);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testChoiceN11() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 1);
            put(3, 2);
            put(4, 1);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoiceN21() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 1);
            put(3, 0);
            put(4, 5);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice541() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 5);
            put(2, 1);
            put(3, 0);
            put(4, 4);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    @Test
    public void testChoice741() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 7);
            put(3, 4);
            put(4, 1);
        }};

        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice751() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 7);
            put(3, 5);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,3);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice632() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 0);
            put(3, 6);
            put(4, 2);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,5);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice642() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 6);
            put(2, 2);
            put(3, 0);
            put(4, 4);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> loseChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, loseChoice);
        

    }
    
    
    @Test
    public void testChoice542() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 4);
            put(2, 5);
            put(3, 0);
            put(4, 2);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice742() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 4);
            put(2, 7);
            put(3, 0);
            put(4, 2);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice652() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 5);
            put(2, 6);
            put(3, 0);
            put(4, 2);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice543() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 5);
            put(2, 4);
            put(3, 0);
            put(4, 3);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,2);
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice0133() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 0);
            put(2, 1);
            put(3, 3);
            put(4, 3);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    
    @Test
    public void testChoice643() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 6);
            put(2, 4);
            put(3, 0);
            put(4, 3);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1);
        assertEquals(bestChoice, cChoice);
        

    }
    
    
    @Test
    public void testChoice11nk() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 1);
            put(3, 5);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,2); 
        assertEquals(bestChoice, cChoice);
        

    }
    
    @Test
    public void testChoice22nk() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 2);
            put(3, 5);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,4); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice3311() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 3);
            put(3, 1);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice6321() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 3);
            put(3, 6);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,6); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice5421() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 4);
            put(3, 5);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(1,2); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice6421() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 4);
            put(3, 6);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(4,1); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice6431() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 3);
            put(2, 6);
            put(3, 4);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice6521() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 6);
            put(3, 5);
            put(4, 1);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> lChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,1); 
        assertEquals(bestChoice, lChoice);
    }
    
    @Test
    public void testChoice2333() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 3);
            put(3, 3);
            put(4, 3);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        
        List<Integer> bestChoice = Arrays.asList(4,1); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice4332() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 3);
            put(3, 4);
            put(4, 3);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(3,2); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice2346() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 2);
            put(2, 3);
            put(3, 6);
            put(4, 4);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,3); 
        assertEquals(bestChoice, cChoice);
    }
    
    @Test
    public void testChoice7331() {

        final HashMap<Integer, Integer> initMap = new HashMap<Integer, Integer>() {{
            put(1, 1);
            put(2, 3);
            put(3, 3);
            put(4, 7);
        }};
        final MarienbadBoard initBoard = new MarienbadBoard(initMap);
        
        
        List<Integer> cChoice = ChoiceOperations.bestChoice(initBoard);
        
        List<Integer> bestChoice = Arrays.asList(2,3); 
        assertEquals(bestChoice, cChoice);
    }
    

    
}
