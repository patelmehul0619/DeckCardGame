package com.cardgame.classes;

public class Deck {
	
	private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed; // How many cards have been dealt from the deck.
    
    public Deck() {
           // Create an un-shuffled deck of cards.
       deck = new Card[52];
       int cardCt = 0; // How many cards have been created so far.
       for ( int suit = 0; suit <= 3; suit++ ) {
          for ( int value = 1; value <= 13; value++ ) {
             deck[cardCt] = new Card(value,suit);
             cardCt++;
          }
       }
       cardsUsed = 0;
    }
    
    public void shuffle() {
          // Put all the used cards back into the deck, and shuffle it into
          // a random order.
        for ( int i = deck.length - 1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
    
    //Deal A card and subtract from the deck
    public Card dealACard() {
    	
    	if(cardsUsed == deck.length){
    		 throw new IllegalArgumentException("There is no cards are left in the deck.");
    	}
          	cardsUsed++;
        return deck[cardsUsed -1];
    }
    
    
}
