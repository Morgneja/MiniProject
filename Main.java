import java.util.Random;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner S = new Scanner(System.in);
    Random r = new Random();

    int userNum;
  

    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number:");
      userNum = S.nextInt();

    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");
   

    playGame(userNum, randomNum);

  }
   static void playGame(int theUserNum, int theRandomNum){
    Scanner Q = new Scanner(System.in);

    int userGuess;
    int numTries = 1;
    


    System.out.println("Please guess a number between 0 and " + theUserNum);
      userGuess = Q.nextInt();
      

    while(userGuess != theRandomNum) {
      if (userGuess >= theRandomNum) {
        System.out.println("Guess lower! Enter a new guess:");
        userGuess = Q.nextInt();
        numTries++;
      }
       else {
         System.out.println("Guess higher! Enter a new guess:");
         userGuess = Q.nextInt();
         numTries++;
       }
       
    
    
    

    }
    System.out.println("Great! You win! The winning number was " +  theRandomNum  + " You guessed it in " + numTries + " tries");

  }
}
