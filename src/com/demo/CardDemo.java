package com.demo;

import java.util.Arrays;
import java.util.Random;

public class CardDemo {
public static void main(String[] args) {

	
	
	//����54��ֽ��
	Card[] cards = new Card[54];
	int i= 0;
	for (int rank = Card.THREE;rank<=Card.DECUE;rank++){
		cards[i++] = new Card(rank,Card.HEART);// ʮ����
		cards[i++] = new Card(rank,Card.SPADE);
		cards[i++] = new Card(rank,Card.DIAMOND);
		cards[i++] = new Card(rank,Card.CLUB);
	} 
	//��Ӵ�С��
	cards[i++] = new Card(Card.BLACK,Card.JOKER);
	cards[i++] = new Card(Card.COLOR,Card.JOKER);
	System.out.println(Arrays.toString(cards));
	
	//ϴ��
	Random r = new Random();
	for(i=cards.length-1;i>=1;i--){
		int j = r.nextInt(i);//i��ʾ���һ����
		Card t = cards[i];
		cards[i] = cards[j];
		cards[j] = t;
	}
	System.out.println(Arrays.toString(cards));
	
	//����
	Player[] players = {new Player(1,"С��"),new Player(2,"�"),new Player(3,"���")};
	int j=0;
	for(i = 0;i<cards.length;i++){
		Card c = cards[i];
		players[j++%players.length].grad(c);
	}
	System.out.println(players[0]);
	System.out.println(players[1]);
	System.out.println(players[2]);
}

}
