package marienbad;

import java.util.HashMap;
import java.util.List;



/**
# this class of methods looks at all the possible losing hands 
# in the game of Marienbad.  grouped according to 
# number of non-zero rows, they are:
# row = 1: 1 
# 
# case row = 2:
#   if two are same (and not 1), then loses, else wins
# 
# case row = 3:
#   if smallest = 1: next are sum == 3 or 6
#   1,1,1
#   3,2,1
#   next two are separate special cases
#   5,4,1
#   6,4,2 
#   next are sum = 14
#   7,5,2
#   7,4,3
#   6,5,3
#   
# case row = 4: 
#   n,n,1,1 (sum = 2*low + 2*high)
#   next are covered by sum == 14 or 16
#   7,4,2,1
#   6,5,2,1
#   6,4,3,1
#   7,5,3,1
*/

public class LosingSituations {
    
    public static boolean stickArrayIsLoser(List<Integer> stick_array) {
        
        int sumOfSticks = stick_array.stream()
                .reduce(0, Integer::sum);
        if (sumOfSticks == 1) {
            return true;
        }
        
        // else we handle the situation in cases
        // the next belongs to 3 or 4 rows
        if ((sumOfSticks == 14) || (sumOfSticks == 16)) {
            return true;
        }
        
    // TODO: IM HERE!!!!!
    switch (RowOperations.getNumberNonZeroRows(stick_array)) {
    
    case 2:  
      return true if stick_array[0]>1 && 
        RowOperations.array_has_repeated_row?(stick_array)
    
    case 3:
      return true if (stick_array == [1,4,5]) || 
        (stick_array == [2,4,6])
      
      return true if stick_array[0]==1 && ((sum_of_sticks == 3) ||
        (sum_of_sticks == 6))
      
    case 4:
      return true if sum_of_sticks == (2*stick_array[0] + 
        2*stick_array[2])

    }
        
        
        
        return false;
        
    }
    
    

    
}
