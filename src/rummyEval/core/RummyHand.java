package rummyEval.core;

import java.util.ArrayList;
import java.util.List;

import rummyEval.entity.*;

public class RummyHand {
	List<Card> cards;
	int[] diffArr;

	public RummyHand(String s) {

		int i;
		cards = new ArrayList<>();
		String[] splitCardString = s.split("\\s+");
		for (i = 0; i < splitCardString.length; i++) {
			Card card = new Card(splitCardString[i].substring(0, 1), splitCardString[i].substring(1));
			cards.add(card);
		}
	}

	public List<Card> getRummyHandCards() {
		return cards;
	}
}
