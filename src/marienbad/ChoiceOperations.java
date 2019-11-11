package marienbad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import marienbad.MarienbadBoard;
import marienbad.RowOperations;

public class ChoiceOperations {
    
    /**
     * 
     * @param gameBoard - assumes not lost yet (i.e. board is not 1000)
     * @return - best choice if not 1
     */
    public static List<Integer> bestChoice (MarienbadBoard gameBoard){
        
        HashMap<Integer,Integer> rowSticksMap = gameBoard.rowsOfSticks;
        HashMap<Integer,Integer> sortedMap = RowOperations.sortedByIncreasingSticks(rowSticksMap);
        List<Integer> sortedList = new ArrayList<>(sortedMap.values());
        
        List<Integer> compareList = Arrays.asList(1,3,5,7);
        if (sortedList.equals(compareList)) {
            Random r = new Random();
            int randomRow = r.nextInt(4) + 1;
            int totalSticks = 1+2*(randomRow -1);
            int randomSticks = r.nextInt(totalSticks)+1;
            
            List<Integer> choice = Arrays.asList(randomRow,randomSticks);
            
            return choice;
        }

        int numberOfRows = RowOperations.getNumberNonZeroRows(sortedList);
        // get the row with the maximum number of sticks
        int maxRow = RowOperations.getOrderAt("row", numberOfRows, sortedMap);
        
        if (LosingSituations.stickArrayIsLoser(sortedList)) {
            List<Integer> choice = Arrays.asList(maxRow,1);
            return choice;
        }

        // TODO: finish rest from here!
          
          # check if removing a row produces a loser
          sorted_map.keys.each{|index|
            # get array with index removed
            array_index_removed = sorted_map.select{|k,v| k!=index }.values
            return [index,sorted_map[index]] if 
              LosingSituations.stick_array_is_loser?(array_index_removed)
          }
          
          # else go through case by case of numbers of non-zero rows
          case number_of_rows
            
            when 1 # do number- 1
              one_row = sorted_map.keys[0]
              one_sticks = sorted_map.values[0]
              return [one_row, one_sticks-1]
              
            when 2 # do max - min
              min_sticks = get_order_at("sticks",1)
              return [max_row, sorted_map[max_row]-min_sticks]
              
            when 3 # check case by case according to first two in array
              first_two_in_stick_array = sorted_array[0,2]
              max_sticks = get_order_at("sticks",3)
              
              case first_two_in_stick_array
                when [1,1] then return [max_row, max_sticks -1]
                  
                when [1,2] then return [max_row, max_sticks -3] if max_sticks>3
                  
                when [1,3] then return [max_row, max_sticks -2]
                  
                when [1,4] then return [max_row, max_sticks -5]
                  
                when [1,5] then return [max_row, max_sticks -4]
                  
                when [2,3] then return [max_row, max_sticks -1]
                  
              end
              
            when 4
              # check for double rows and change to min min k k
              if has_repeated_row?
                # first get other rows
                other_rows = [1,2,3,4] - two_same
                # get sorted map, select by other rows
                sorted_others = sorted_map.select{|k,v| other_rows.include? k }
                min_others = sorted_others.values[0]
                max_others = sorted_others.values[1]
                max_row_others = sorted_others.keys[1]
                return [max_row_others, max_others-min_others]
              end
            
          end
          
          # rest are point cases 
          min_row = get_order_at("row",1)
          mid_row = get_order_at("row",2)
          
          case sorted_array
            when [2,4,5] then return [min_row, 1]
              
            when [2,4,7] then return [max_row, 1]
              
            when [2,5,6] then return [mid_row, 1]
              
            when [3,4,5] then return [min_row, 2]
              
            when [3,4,6] then return [min_row, 1]
              
            when [3,5,7] then return [min_row, 1]
              
            when [1,3,4,7] then return [max_row, 1]
              
          end
          
          return [max_row,1]
        end
    
}
