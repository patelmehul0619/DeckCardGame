package com.cardgame.classes;

public class Card {
	
	//Codes for 4 suits and joker
	public final static int JOKER = 0;
	public final static int CLUBS = 1;
	public final static int DIAMONDS = 2;
	public final static int HEARTS = 3;
	public final static int SPADES = 4;
	
	//Codes for non-numeric cards
	public final static int ACE = 1;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
	
	//define value of each suit 13
	private final int suit;
	
	//Value of card between 1 to 13
	private final int val;
	
	//Constructor to create JOKER, its value is 1 since every deck has one JOKER
	public Card(){
		suit = JOKER;
		val = 1;
	}
	
	//This constructor set value of 13 cards.
	
	public Card(int val, int suit) {
	      if (suit != SPADES && suit != HEARTS && suit != DIAMONDS && 
	            suit != CLUBS && suit != JOKER)
	         throw new IllegalArgumentException("Illegal playing card suit");
	      if (suit != JOKER && (val < 1 || val > 13))
	         throw new IllegalArgumentException("Illegal playing card value");
	      this.val = val;
	      this.suit = suit;
	   }
	
	//return value of suit
	public int getSuit() {
	      return suit;
	}
	
	
	//return value of val
	public int getVal(){
		return val;
	}
	
	//return type of suit
	public String getSuitType(){
		switch(suit){
		case SPADES:   return "Spades";
	      case HEARTS:   return "Hearts";
	      case DIAMONDS: return "Diamonds";
	      case CLUBS:    return "Clubs";
	      default:       return "Joker";
		}
	}
	
	//return value of a card in String
	
	public String getValueOfCard(){
		
		
		if (suit == JOKER)
	         return "" + val;
	      else {
	         switch ( val ) {
	         case 1:   return "Ace";
	         case 2:   return "2";
	         case 3:   return "3";
	         case 4:   return "4";
	         case 5:   return "5";
	         case 6:   return "6";
	         case 7:   return "7";
	         case 8:   return "8";
	         case 9:   return "9";
	         case 10:  return "10";
	         case 11:  return "Jack";
	         case 12:  return "Queen";
	         default:  return "King";
	         }
	      }
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", val=" + val + "]";
	}
	
	

}
