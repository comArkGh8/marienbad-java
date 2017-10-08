package marienbad;

public class LosingSituations {
    
    
    
    
    /**
     * 
     * @param gameBoard
     * @return true if not done, false if only one stick left
     */
    
    public static boolean notLostYet(MarienbadBoard gameBoard){
        // need number of nonZeroRows = 1
        // and max number = 1
        
        int numberRows = RowOperations.getNumberNonZeroRows(gameBoard);
        int maxNumber = RowOperations.getMaxStick(gameBoard);
        if (numberRows == 1 && maxNumber == 1){
            return false;
        }
        return true;
    }
    
    

    

    /**
     * 
     * @param gameBoard - assuming there are only two non-zero rows
     * @return - true if it is a losing hand
     * 
     */
    public static boolean caseTwoRows(MarienbadBoard gameBoard){
        // algorithm: if maxSticks>1
        // and two are same, then loses, else wins
        
        int maxSticks = RowOperations.getMaxStick(gameBoard);
        int maxRow = RowOperations.getMaxRow(gameBoard);
        if (maxSticks==1){
            return false;
        }
        
        // find other non-zero row
        int otherRow=0;
        for (int index = 0; index<4; index++){
            if (index+1 != maxRow && gameBoard.rowsOfSticks.get(index)>0){
                otherRow=index+1;
            }
        }
        
        if (gameBoard.rowsOfSticks.get(otherRow-1)==gameBoard.rowsOfSticks.get(maxRow-1)){
            return true;
        }
        return false;
    }
    
    /**
     * 
     * @param gameBoard - assumes three non-zero rows
     * @return -true if it is losing
     */
    
    public static boolean caseThreeRows(MarienbadBoard gameBoard){
        // losing situations of 3 rows
        // they are:
        //  1,1,1
        //  3,2,1
        //  5,4,1
        //  6,4,2
        //  7,5,2
        //  7,4,3
        //  6,5,3
        
        int minNumber = RowOperations.getSmallestNonZero(gameBoard);
        int secondSmallest = RowOperations.getSecondSmallestNonZero(gameBoard);
        int maxNumber = RowOperations.getMaxStick(gameBoard);
        
        switch (minNumber) {
            case 1:
                switch(secondSmallest) {
                    case 1: if (maxNumber == 1){
                            return true;
                        }
                        return false;
                    
                    case 2: if (maxNumber == 3){
                            return true;
                        }
                        else{
                            return false;
                        }
                        
                    case 4:if (maxNumber == 5){
                        return true;
                        }
                        else{
                            return false;
                        }
                   
                }
                return false;
            
            case 2: 
                if (secondSmallest == 4 && maxNumber == 6){
                    return true;
                }
                if (secondSmallest == 5 && maxNumber == 7){
                    return true;
                }
                return false;
                
            case 3:
                if (secondSmallest == 4 && maxNumber == 7){
                    return true;
                }
                if (secondSmallest == 5 && maxNumber == 6){
                    return true;
                }
                return false;
                
        }

                
        return false;
    }
    
    public static boolean caseFourRows(MarienbadBoard gameBoard){
        // losing situations of 4 rows
        // they are:
        //  n,n,1,1
        //  7,4,2,1
        //  6,5,2,1
        //  6,4,3,1
        //  7,5,3,1
        //  k,k,2,2
        //  5,4,3,2
        //  DONE!!!
        
        
        
        int minNumber = RowOperations.getSmallestNonZero(gameBoard);
        int secondSmallest = RowOperations.getSecondSmallestNonZero(gameBoard);
        int secondHighest = RowOperations.getSecondHighestNonZero(gameBoard);
        int maxNumber = RowOperations.getMaxStick(gameBoard);
        
        switch (minNumber){
        case 1:
            switch (secondSmallest){
            case 1:
                if (secondHighest == maxNumber){
                    return true;
                }
                return false;
                
            case 2:
                switch (secondHighest){
                case 4:
                    if (maxNumber == 7){
                        return true;
                    }
                    return false;
                    
                case 5: 
                    if (maxNumber == 6){
                        return true;
                    }
                    return false;
                }
                
            case 3:
                switch (secondHighest){
                case 4:
                    if (maxNumber == 6){
                        return true;
                    }
                    return false;
                    
                case 5:
                    if (maxNumber == 7){
                        return true;
                    }
                    return false;
                    
                }
                
            }
            
        case 2:
            switch (secondSmallest){
            case 2:
                if (secondHighest == maxNumber){
                    return true;
                }
                return false;
                
            case 3: 
                switch (secondHighest){
                case 4: 
                    if (maxNumber == 5){
                        return true;
                    }
                    return false;
                }
                return false;
            }
            
           
        }
        
        
        return false;
    }
    
}
