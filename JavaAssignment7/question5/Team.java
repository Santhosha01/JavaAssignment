package encapsulation.question5;

import java.util.List;

public class Team {
	public String name;
	public String city;
	public String division;
    public List<Player> players; 
	
	public void playGame() {
		System.out.println("Playing");
	}

	public void getDetails() {
		System.out.println("\n Team Details : \n\n Name = " + name + "\n City = " + city + "\n Division = " + division);
	}
	public void hireCoach() {
		System.out.println("Hiring Coach");
	}
}
