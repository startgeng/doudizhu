package com.demo;

import java.util.Arrays;

public class Player {
private Card[] cards ={}; //手中牌
private String name;//玩家姓名
private int id;

public Player(int id,String name){
	this.id=id;
	this.name=name;
}

//抓牌
public void grad(Card card){
	cards = Arrays.copyOf(cards, cards.length+1);
	cards[cards.length - 1] =card;
}

@Override
public String toString() {
	return id+":"+name+"的牌为"+Arrays.toString(cards);
	
}

}
