package rummyEval.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards;

	public Deck() {
		cards = new ArrayList<>();
		Pack p = new PackWithJoker();
		cards.addAll(p.getCards());
	}

	public Deck(List<Pack> packs) {
		cards = new ArrayList<>();
		for (Pack p : packs) {
			cards.addAll(p.getCards());
		}
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public String toString() {
		return cards.toString();
	}

}
