package rummyEval.core;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

import rummyEval.entity.Card;

public class EvaluatorUtility {


	private static String sequences = "23456789TJQKA";
	
	public boolean isASequence(String s)
	{
		// String s contains the above characters and x where x is a joker.
		// a valid sequence can be 23x5,x234
		//this should return true if that is the case.
		return false;
	}
	
	public boolean isASet(String s)
	{
		//I will send you a String of above characters and x-es. You have to check for validity. Ex of valid set - 22x,222x,4xx3
		return false;
	}
	
	
	public static List<String> getModifiedStrings(RummyHand r,Card joker)
	{
		//should give a string of sorted cards according to Suit. Separate Suits by space. 
		//Represent jokers by x.
		//Ex - C2 D4 D5 H7 JOKER H8 CJ => "X 2J 45 78"
		List<Card> cards = r.getRummyHandCards();
		List<Card> cardList = new ArrayList<Card>();
		String outputString = "";
		cardList = r.getRummyHandCards();
		
		Collections.sort(cardList,Card.valueComparator);
		Collections.sort(cardList,Card.suitComparator);
		String prevSuit = "";
		for(Card card: cardList) {
			if(card.getFaceValue().equals("JOKER")||card.getFaceValue().equals(joker.getFaceValue()))
			{
				outputString+="x"+" ";
			}
			else{
				outputString+=card.toString()+" ";
			}
		}
		return debug(outputString);
		
	}
	
	private static List<String> debug(String str)
	{
		return null;
	}

	
	public static Comparator<Character>seqComparator = new Comparator<Character>() {

		@Override
		public int compare(Character o1, Character o2) {
			return sequences.indexOf(""+o1)-sequences.indexOf(""+o2);
		}
	};
	
}
