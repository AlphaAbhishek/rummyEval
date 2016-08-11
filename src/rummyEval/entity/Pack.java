package rummyEval.entity;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Pack {

	protected List<Card> cards;
	
	
	public Pack(){
		cards = new ArrayList<>();
		for(char c : Card.getSuits().toCharArray())
		{
			for(char t : Card.getFaceValues().toCharArray())
			{
				cards.add(new Card(""+c,""+t));
			}
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}

	
}
