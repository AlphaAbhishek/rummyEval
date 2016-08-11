package rummyEval.entity;

import java.util.Comparator;

public class Card{
	
	private static String faceValues = "23456789TJQKA"; //Joker??
	private static String suits = "CDHS";
	
	private String faceValue;
	private String suit;
	
	public Card(String suit,String faceValue)
	{
		this.suit =suit;
		this.faceValue = faceValue;
	}
	
	public boolean isSameSuit(Card c)
	{
		return this.suit.equals(c.suit);
	}

	public static String getFaceValues()
	{
		return faceValues;
	}
	
	public static String getSuits()
	{
		return suits;
	}
	
	public String getSuit(){
		return this.suit;
	}
	
	public String getFaceValue(){
		return this.faceValue;
	}
	public static Comparator<Card> valueComparator = new Comparator<Card>() {
	    public int compare(Card c1, Card c2) {
	        return faceValues.indexOf(c1.getFaceValue())-faceValues.indexOf(c2.getFaceValue()); // use your logic
	    }
	};
	
	public static Comparator<Card> suitComparator = new Comparator<Card>() {
	    public int compare(Card c1, Card c2) {
	    	return suits.indexOf(c1.getSuit())-suits.indexOf(c2.getSuit()); // use your logic
	    }
	};
	
	public String toString(){
		return this.suit + this.faceValue;
	}
	
	
}
