public class Scene00 {
	// temporary hero created
	public static Actor hero = new Actor();

	public static void main(String[] args) {
		System.out.println("\n\n\n\nYou enter the mine and walk a few feet.");
		System.out.println("You find a piece of gold and pick it up.");
		
		//TODO Make actor class
		hero.gold++;
		
		System.out.println("It makes a pleasant clink in your bag of treasure.");
		System.out.println("\nYou continue walking into the mine.");
		System.out.println("Everything is fine, so far.");
	}

}
