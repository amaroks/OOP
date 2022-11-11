
public abstract class Sport {
	public String name;
	public String typeOfSport;
	public int duration;
	public int numberOfPlayers;
	public Boolean firstTimePlaying;
	
	// No args constructor
	public Sport() {
		System.out.println("In constructor");
	}
	
	// All args constructor
	public Sport(String name, int numberOfPlayers) {
		this.name = name;
		this.numberOfPlayers = numberOfPlayers;
	}
	
	public void startSport() {
		System.out.println("Sport duurt " + duration + " minuten");
		System.out.println("Type sport is " + name);
		System.out.println("Hoeveel spelers? " + numberOfPlayers);
	}
	
	public boolean startSport1(int maxPeople, String name) {
		System.out.println("Max people = " + maxPeople);
		System.out.println("Name = " + name);
		return true;
	}
	
	public boolean startSport2(int duration, String name) {
		System.out.println("Duration = " + duration);
		System.out.println("Name = " + name);
		return true;
	}
	
	public int sportNumbers(int duration, int numberOfPlayers) {
		System.out.println("Duration = " + duration);
		System.out.println("Nr of players = " + numberOfPlayers);
		return duration + numberOfPlayers;
	}
	

	public abstract int bepaalPrijs(); 
	
}
