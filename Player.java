/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int points;
  private Scanner sc = new Scanner(System.in);
  /* your code here - constructor(s) */ 
  public Player(){
    name = "";
    points = 0;
    System.out.print("Enter Player Name: ");
    name = sc.nextLine();
  }
  public Player(String inputName){
    name = inputName;
  }
  /* your code here - accessor(s) */ 
  public String getName(){
    return name;
  }
  public int getPoints(){
    return points;
  }

  /* your code here - mutator(s) */ 
  public void setName(String inputName){
    name = inputName;
  }
  public void addToPoints(int val){
    points += val;
  }
}
