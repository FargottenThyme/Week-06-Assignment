package Week06FinalCodingProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Fields
	private List<Card> hand = new ArrayList<Card>();
	protected int score;
	private String name;
	
	//Constructor
	public Player() {
		this.score = 0;
	}
	//Methods
	public void describe() {
		System.out.println("Player: " + this.name + "\nScore: " + this.score);
		System.out.println("Cards:\n*************");
		for (Card card : hand) {
			card.describe();
			System.out.println();
		}
	}
	
	public Card flip() {
		return this.hand.remove(0);
	}
	
	public void draw(Deck deck) {
		this.hand.add(deck.draw());
	}
	
	public void incrementScore() {
		this.score++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}