package marienbad;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameInterface {

    public static void main(String[] args) {
        

        
        MarienbadBoard gameBoard = new MarienbadBoard();
        
        Scanner in = new Scanner(System.in);
        
        String whoPlays;
        
        System.out.println("Welcome to the game of Marienbad");
        System.out.println("The game board looks like:");
        System.out.println(gameBoard.rowsOfSticks);
        System.out.println("Who goes first?");
        System.out.println("Enter 'c' for computer, 'p' for yourself:");
        whoPlays = in.nextLine();
        System.out.println("You entered "+ whoPlays);
        
        // first player loses so let computer make a random choice
        if (whoPlays.equals("c")){
            Random randomGenerator = new Random();
            int randomRowIndex = randomGenerator.nextInt(4);
            int randomRow = randomRowIndex+1;
            // there are 1 + (randomRowIndex)*2 sticks to get
            int numSticks = 1 + (randomRowIndex)*2;
            int randomStickChoice = randomGenerator.nextInt(numSticks)+1;
            List<Integer> choiceList = Arrays.asList(randomRow,randomStickChoice); 
            
            System.out.println("The computer chooses " +
                    randomStickChoice + " sticks from row " + randomRow+".");
            
            gameBoard.change(randomRow, randomStickChoice);
            
            System.out.println("the game board now looks like:");
            
            System.out.println(gameBoard.rowsOfSticks);
            
        }
        
        // as long as not loser keep going
        while(LosingSituations.notLostYet(gameBoard)){
            int rowChoice;
            int stickChoice;
            List<Integer> choiceList;
            
            System.out.println("Enter the row:");
            rowChoice = in.nextInt();
            System.out.println("Enter the number of sticks to take");
            stickChoice = in.nextInt();
            
            gameBoard.change(rowChoice, stickChoice);
            System.out.println("The game board looks now like:");
            System.out.println(gameBoard.rowsOfSticks);
            
            if (!LosingSituations.notLostYet(gameBoard)){
                System.out.println("Congratulations!  You won!"); 
                break;
            }
            
            System.out.println("");
            System.out.println("Now it's the computer's turn:"); 
            
            // get number of non-zero rows and use the best choice according
            // to each case
            
            int numberRows = RowOperations.getNumberNonZeroRows(gameBoard);
            if(numberRows==1){
                // a losing situation is already caught above
                choiceList = ChoiceOperations.bestChoiceOne(gameBoard);
                rowChoice = choiceList.get(0);
                stickChoice = choiceList.get(1);
                gameBoard.change(rowChoice, stickChoice);
            }
            else if(numberRows==2){
                choiceList = ChoiceOperations.bestChoiceTwo(gameBoard);
                rowChoice = choiceList.get(0);
                stickChoice = choiceList.get(1);
                gameBoard.change(rowChoice, stickChoice);
            }
            else if(numberRows==3){
                choiceList = ChoiceOperations.bestChoiceThree(gameBoard);
                rowChoice = choiceList.get(0);
                stickChoice = choiceList.get(1);
                gameBoard.change(rowChoice, stickChoice);
            }
            else{
                choiceList = ChoiceOperations.bestChoiceFour(gameBoard);
                rowChoice = choiceList.get(0);
                stickChoice = choiceList.get(1);
                gameBoard.change(rowChoice, stickChoice);
            }
            

            
            System.out.println("The computer chooses " + stickChoice + " sticks "
                    + "from row " + rowChoice);
            System.out.println("The game board looks now like:");
            System.out.println(gameBoard.rowsOfSticks);
            
            if (!LosingSituations.notLostYet(gameBoard)){
                System.out.println("Sorry, but you lost.  :( "); 
                break;
            }
        }
        
        
        
        

    }

}
