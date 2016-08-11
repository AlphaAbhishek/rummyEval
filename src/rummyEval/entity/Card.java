package rummyEval.entity;

import java.util.Comparator;

public class Card implements Comparable<Card> {
	
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
	@Override
	public int compareTo(Card a) {
		return faceValues.indexOf(this.faceValue)-faceValues.indexOf(a.faceValue);
	}
	
	public String toString(){
		return this.suit +" "+ this.faceValue;
	}
	
	
}
