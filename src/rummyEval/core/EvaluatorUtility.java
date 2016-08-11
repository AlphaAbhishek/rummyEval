package rummyEval.core;

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
		//I will send you a String of above characters and x-es. You have to check for validity. Ex of valid set - 22x,222x,4xx4
		return false;
	}
}
