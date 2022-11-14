/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

import org.graalvm.compiler.replacements.ReplacementsUtil;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;
import jdk.tools.jlink.internal.PerfectHashBuilder;
  
public class PhraseSolver
{
  /* your code here - attributes */
  private Player player1;
  private Player player2;
  private Board board;
  private boolean solved;
  /* your code here - constructor(s) */ 
  public PhraseSolver(){
    player2 = new Player();
    player1 = null;
    board = null;
    solved = false;
  }
  /* your code here - accessor(s) */

  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      if (currentPlayer%2==1)  { 
        System.out.println("Player 1 input your guess:");
        String playerGuess = input.nextLine().substring(0,1);
        solvedPhrase = solvedPhrase.replace(" ", "");
        String[]  solvedFrase = solvedPhrase.split("");
        for(int i = 0; i < solvedFrase.length; i++){
          if(solvedFrase[i].equals(playerGuess)){
                 
          }
        }
        


      }
    
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}