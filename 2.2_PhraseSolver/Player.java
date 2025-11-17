/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player {
  private String name;
  private int points;

  // No-argument constructor -->  prompts user for name
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter player name: ");
    this.name = scanner.nextLine();
    this.points = 0;
    System.out.println("Welcome to the game, " + this.name + "!");
  }

  // Constructor with inputName parameter
  public Player(String inputName) {
    this.name = inputName;
    this.points = 0;
    System.out.println("Welcome to the game, " + this.name + "!");
  }

  // gets and sets
  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}