package week5;

import java.util.ArrayList;

public class Team {
  private String name;                          			
  private ArrayList<Player> players = new ArrayList<>();  	
  private int maxSize = 30;                      			

  // Constructor that takes the team's name as an argument
  public Team(String name) {
    this.name = name;
  }

  // Returns the team's name
  public String getName() {
    return name;
  }

  // Sets the team's name
  public void setName(String name) {
    this.name = name;
  }

  // Adds a player to the team, if the number of players is less than the maximum size
  public void addPlayer(Player player) {
    if (players.size() < maxSize) {
      this.players.add(player);
    }
  }

  // Prints the names of all players on the team
  public void printPlayers() {
    for (int i = 0; i < players.size(); i++) {
      System.out.println(players.get(i));
    }
  }

  // Sets the maximum number of players on the team
  public void setMaxSize(int maxSize) {
    this.maxSize = maxSize;
  }

  // Returns the number of players on the team
  public int size() {
    return players.size();
  }

  // Returns the total number of goals for all players on the team
  public int goals() {
    int totalGoals = 0;
    for (int i = 0; i < players.size(); i++) {
      totalGoals += players.get(i).getGoals();
    }
    return totalGoals;
  }
}
