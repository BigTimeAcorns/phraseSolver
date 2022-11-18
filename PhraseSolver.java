/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;
  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    player1 = new Player();
    player2 = new Player();
    board = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;
    boolean correct = true;
    Player curPlayer;

    System.out.println("-------------------------------");
    System.out.println(board.getSolvedPhrase());
    Scanner input = new Scanner(System.in);
    while(!solved){
      if (currentPlayer%2 == 1){
        curPlayer = player1;
        currentPlayer++;
      }else{
        curPlayer = player2;
        currentPlayer++;
      }
      System.out.print(curPlayer.getName() + " input your guess: ");
      String playerGuess = input.nextLine();
      board.guessLetter(playerGuess);
      if(board.isSolved(playerGuess)){
        System.out.println("Congrats " + curPlayer.getName() + " you guessed the phrase!");
        solved = true;
        break;
      }
      if(board.guessLetter(playerGuess)){
        curPlayer.addToPoints(board.setLetterValue());
        System.out.println("You got " + curPlayer.getPoints() + " point(s)!");
      }else{
        System.out.println("That is not a valid letter :(");
      }
      if(board.getSolvedPhrase().replace(" ","").equals(board.getPhrase().replace(" ",""))){
        System.out.println("Congrats you guessed the phrase!");
        if(player1.getPoints() > player2.getPoints()){ System.out.println(player1.getName() + " won with " + player1.getPoints() + " points and " + player2.getName() + " had " + player2.getPoints() + " points!");}
        if(player1.getPoints() < player2.getPoints()){ System.out.println(player2.getName() + " won with " + player2.getPoints() + "points and " + player1.getName() + " had " + player1.getPoints() + " points!");}
        solved=true;
        break;
      }
      System.out.println("-------------------------------");
      System.out.println(board.getSolvedPhrase());
      
    }
    input.close();
  }
}
