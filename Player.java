package week5;


public class Player {
	private String name;
	private int goals;
	
	public Player(String name, int goals) {
		this.name=name;
		this.goals=goals;
	}
	public Player(String name) {
		this.name=name;
		this.goals=0;
		}
	
//	Setter and getter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
//	Setter and getter for goals

	public void setGoals(int goals) {
		this.goals=goals;
	}
	public int getGoals() {
		return goals;
	}
	
	public String toString() {
		return(name+", goals: "+goals);
	}
	
}
