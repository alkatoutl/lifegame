package lecture.lab1;

public class BobsLife {

	private String location;
	private int hunger;
	private int fitness;
	private int dollars;
	private int timeCounter;
	
	public BobsLife(String location, int hunger, int fitness, int dollars) {
		this.location = location;
		this.hunger = hunger;
		this.fitness = fitness;
		this.dollars = dollars;
	}
	
	public void move(String location) {
		switch(location) {
		case "home": 
			this.location = "home";
			break;
		case "gym":
			this.location = "gym";
			break;
		case "work":
			this.location = "work";
			break;
		}
	}
	
	public void nextTime() {
		timeCounter++;
		if(location.equalsIgnoreCase("home")) {
			hunger -= 3;
			if(hunger < 0) {
				hunger = 0;
			}
			dollars -=1;
			if(dollars < 0) {
				System.out.println("Bob has been thrown in jail.");
				System.exit(1);
			}
		}
		if(location.equalsIgnoreCase("work")) {
			hunger += 2;
			if(hunger > 6) {
				System.out.println("Bob has starved to death.");
				System.exit(1);
			}
			dollars += 3;
			fitness -= 1;
			if(fitness == 0 || fitness < 0) {
				System.out.println("Bob has died of a heart attack.");
				System.exit(1);
			}
		}
		if(location.equalsIgnoreCase("gym")) {
			hunger += 3;
			if(hunger > 6) {
				System.out.println("Bob has starved to death.");
				System.exit(1);
			}
			dollars -= 2;
			if(dollars < 0) {
				System.out.println("Bob has been thrown in jail.");
				System.exit(1);
			}
			fitness += 2;
		}
	}
	
	
	public String toString() {
		return "Step: " + timeCounter + " - " + "Location: " + location + ", "
				+ "Hunger: " + hunger + ", "
				+ "Fitness: " + fitness + ", "
				+ "Dollars: " + dollars;
	}
}
