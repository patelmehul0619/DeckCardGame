package com.cardgame.classes;

public class MainClass {

	public static void main(String[] args) throws IllegalStateException {
		
		Deck deck = new Deck();
		deck.shuffle();
		
		for (int i = 1; i <= 53; i++) {
			Card card = deck.dealACard();
		    System.out.println(i + " : card [" + card + "]");
		}


	}

}
