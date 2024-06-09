package Week06FinalCodingProject;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Deck {
	//Fields
	private List<Card> cards = new ArrayList<Card>();
	
	//Methods
	public Deck() {
		String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven",
				 "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for (String suit : suits) {
			int cardNum = 2;
			for (String name : names) {
				cards.add(new Card(cardNum, (name + " of " + suit)));
				cardNum++;
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card topCard = this.cards.remove(0);
		return topCard;
	}
}
