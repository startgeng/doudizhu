package com.demo;

import java.util.Arrays;

public class Player {
private Card[] cards ={}; //������
private String name;//�������
private int id;

public Player(int id,String name){
	this.id=id;
	this.name=name;
}

//ץ��
public void grad(Card card){
	cards = Arrays.copyOf(cards, cards.length+1);
	cards[cards.length - 1] =card;
}

@Override
public String toString() {
	return id+":"+name+"����Ϊ"+Arrays.toString(cards);
	
}

}
