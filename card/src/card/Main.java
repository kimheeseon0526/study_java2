package card;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		play();
	}
	
	static void play() {
		List<Player> players = new ArrayList<Player>();	//플레이어 4명
		Deck deck = new Deck();
		deck.shuffle();
		players.add(new Player("새똥이"));
		players.add(new Player("개똥이"));
		players.add(new Player("소똥이"));
		players.add(new Player("말똥이"));
		
		
		for(int i = 0; i < players.size(); i++) {
			for(int j = 0; j < 5; j++) {
				players.get(i).cards.add(deck.pick());
			}
		}
		
//		players[0].cards[0] = deck.pick();
//		players[1].cards[0] = deck.pick();
//		
//		players[0].cards[1] = deck.pick();
//		players[1].cards[1] = deck.pick();
//		players[0].cards[2] = deck.pick();
//		players[0].cards[3] = deck.pick();
//		players[0].cards[4] = deck.pick();
		
		for(Player p : players) {
			System.out.println(p);
		}
		System.out.println("deck의 남은 카드 갯수 : " + deck.cards.size());
	}
}
