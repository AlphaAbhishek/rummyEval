package rummyEval.core;
import java.util.List;

import rummyEval.entity.*;

public class RummyHand {
	List<Card> cards;
	int[] diffArr;

	public RummyHand(String s){
		//Construct a Rummy Hand using a String. 
		//Two cards are separated by spaces.Ex : C2 D4. Club 2 and Diamond 4. Look at other constructors.
		int i;
		String[] splitCardString = s.split("\\s+");
		for(i=0; i< splitCardString.length; i++) {
			Card card = new Card(splitCardString[i].substring(0,1) ,splitCardString[i].substring(1));
			cards.add(card);
		}
	}
}
