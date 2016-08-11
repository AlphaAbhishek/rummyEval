package rummyEval.entity;

public class PackWithJoker extends Pack {
	private Card jokerCard = new Card("JOKER","JOKER");
	
	public PackWithJoker() {
		super();
		addJokers(2);
	}
	
	public PackWithJoker(int count) {
		super();
		addJokers(count);
	}
	
	private void addJokers(int count){
		for(int i = 0; i<count; i++){
			cards.add(jokerCard);
		}
	}
}
