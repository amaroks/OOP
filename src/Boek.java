
public class Boek {
	public String authorName;
	public int numberOfPages;
	public int bookPrice;
	
	// Methods
	public void boekInfo() {
		System.out.println("Naam van auteur: " + authorName);
	}
	
	public boolean boekInfo2(int numberOfPages, int bookPrice) {
		System.out.println("Aantal blz = " + numberOfPages);
		System.out.println("Prijs boek = " + bookPrice);
		return true;
	}
	
	// Constructors 
	public Boek() {
		System.out.println("Dit is de titel");
	}
	
	public Boek(String authorName, int numberOfPages) {
		this.authorName = authorName;
		this.numberOfPages = numberOfPages;
	}
}
