package week5;

public class Player {
  // The player's name
  private String name;

  // The number of goals the player has scored
  private int goals;

  // Constructor that takes the player's name and number of goals as arguments
  public Player(String name, int goals) {
    this.name = name;
    this.goals = goals;
  }

  // Constructor that takes only the player's name as an argument and sets their goals to 0
  public Player(String name) {
    this.name = name;
    this.goals = 0;
  }

  // Sets the player's name
  public void setName(String name) {
    this.name = name;
  }

  // Returns the player's name
  public String getName() {
    return name;
  }

  // Sets the player's number of goals
  public void setGoals(int goals) {
    this.goals = goals;
  }

  // Returns the player's number of goals
  public int getGoals() {
    return goals;
  }

  // Returns a string representation of the player's name and number of goals
  public String toString() {
    return name + ", goals: " + goals;
  }
}
