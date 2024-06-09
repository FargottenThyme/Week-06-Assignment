package Week06FinalCodingProject;

public class Card {
	// Fields
	private int value;
	private String name;
	
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//Methods
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		if (value > 1 && value <= 14) {
		this.value = value;	
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(getName());
	}
}
