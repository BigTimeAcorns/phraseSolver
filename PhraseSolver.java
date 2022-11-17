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

    public void guessing(Player  p){
      Scanner input = new Scanner(System.in);
      System.out.println(board.getSolvedPhrase());
      System.out.println(board.getPhrase());
      for(int i = 0; i <= board.getSolvedPhrase().length(); i++ ){
        System.out.print(p.getName() + " input your guess: ");
        String playerGuess = input.nextLine();
        board.guessLetter(playerGuess);
        if(board.isSolved(playerGuess)){
          System.out.println("Congrats " + p.getName() + " you guessed the phrase!");
          solved = true;
          break;
        }
        if(board.guessLetter(playerGuess)){
          p.addToPoints();
          System.out.println("You got " + p.getPoints());
        }
      }
      /* your code here - determine how game ends */
      solved = true; 
  
  }
}
}