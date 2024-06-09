package Week06FinalCodingProject;

public class App {
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Player one = new Player();
		one.setName("One");
		Player two = new Player();
		two.setName("Two");
		deck.shuffle();
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				one.draw(deck);
			} else {
				two.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card oneCard = one.flip();
			int x = oneCard.getValue();
			Card twoCard = two.flip();
			int y = twoCard.getValue();
			System.out.println(oneCard.getName() + " VS " + twoCard.getName());
			if (x > y) {
				one.incrementScore();
				System.out.println("Player " + one.getName() + " wins!");
			} else if (x < y) {
				two.incrementScore();
				System.out.println("Player " + two.getName() + " wins!");
			} else {
				System.out.println("Draw!");
			}
			System.out.println("Current Score:\n" + one.getName() + ": " + one.score + "\n" + two.getName() + ": " + two.score + "\n");
		}
		
		System.out.println("Final Score:\n" + one.getName() + ": " + one.score + "\n" + two.getName() + ": " + two.score + "\n");
		if (one.score > two.score) {
			System.out.println(one.getName() + " Wins the Game!");
		} else if (one.score < two.score) {
			System.out.println(two.getName() + " Wins the Game!");
		} else {
			System.out.println("Draw! No one wins!");
		}
		
	}

}
