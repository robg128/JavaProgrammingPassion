package listarraylistdeal;

import java.util.*;

class Deal {
	public static void main(String args[]) {

		int numHands = 3;
		int cardsPerHand = 4;

		// Get number of hands and cards per hands from command line arguments
		if (args.length == 2) {
			numHands = Integer.parseInt(args[0]);
			cardsPerHand = Integer.parseInt(args[1]);
		}

		// Make a normal 52-card deck
		String[] suit = new String[] { "spades", "hearts", "diamonds", "clubs" };
		String[] rank = new String[] { "ace", "2", "3", "4", "5", "6", "7", "8",
				"9", "10", "jack", "queen", "king" };
		List deck = new ArrayList();
		for (int i = 0; i < suit.length; i++)
			for (int j = 0; j < rank.length; j++)
				deck.add(rank[j] + " of " + suit[i]);

		Collections.shuffle(deck);

		// Create a deck of cards for each player
		for (int i = 0; i < numHands; i++)
			System.out.println("Cards for player #" + (i + 1) + ": "
					+ dealHand(deck, cardsPerHand));
	}

	public static List dealHand(List deck, int n) {
		int deckSize = deck.size();
		System.out.println("deckSize = " + deckSize);
		// Returns "a view" of the portion of this list between the
		// specified fromIndex, inclusive, and toIndex, exclusive.
		List handView = deck.subList(deckSize - n, deckSize);
		// Create another List object from handView since we have
		// to call remove() to it.
		List hand = new ArrayList(handView);
		// Remove the deck of cards from the original list
		// handView.clear(); // This works as well instead of the line below
		deck.removeAll(hand);
		return hand;
	}
}
