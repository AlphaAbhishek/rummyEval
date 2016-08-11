package rummyEval.test;

import rummyEval.core.EvaluatorUtility;
import rummyEval.core.RummyHand;
import rummyEval.core.RummyHandEvaluator;
import rummyEval.entity.Card;

public class Test {

	public static void main(String[] args) {
		RummyHand r = new RummyHand("D6 C5 D7 H2 DT");
		Card jokerCard = new Card("D","6");
		System.out.println(EvaluatorUtility.getModifiedStrings(r,jokerCard));
	}
}
