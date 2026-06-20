
package deckofcards7_4;

public class DeckOfCardsListing7_2 {

    public static void main(String[] args) {
        // Case Study : Deck Of Cards
        int[] deck = new int[52];
        for (int i = 0 ; i < deck.length; i++){
        deck[i] = i;
        }
        
        String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9",
            "10","Jack","Queen","King"};    
        for (int i = 0 ; i < deck.length; i++){
            int randomIndex = (int)(Math.random()*deck.length);
                int temp = deck[i];
                deck[i] = deck[randomIndex];
                deck[randomIndex] = temp;
        }
        for(int i = 0 ; i < 4; i++){
        String suit = suits[deck[i] / 13];
        String rank = ranks[deck[i] % 13];
            System.out.println("Card Number " + deck[i] + " : " + 
                    rank + " of " + suit);
        } 
    }
    
}
