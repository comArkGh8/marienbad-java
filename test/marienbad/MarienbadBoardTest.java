package marienbad;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MarienbadBoardTest {

    @Test
    public void testChange33To31() {
        
        final List<Integer> initList = Arrays.asList(0,0,3,3);
        final MarienbadBoard initBoard = new MarienbadBoard(initList);
        
        initBoard.change(3, 2);
        System.out.println(initBoard.rowsOfSticks);
        
        System.out.println(ChoiceOperations.bestChoiceTwo(initBoard));
        
 
    }
    
    

}
