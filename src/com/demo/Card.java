package com.demo;

public class Card {
private int rank; //����
private int sult;  //��ɫ

//��ɫ
static final int HEART = 0;
static final int SPADE =1;
static final int DIAMOND = 2;
static final int CLUB = 3;
static final int JOKER = 4;

//����
static final int THREE = 0;
static final int FOUR = 1;
static final int FIVE =2 ;
static final int SIX = 3;
static final int SEVEN = 4;
static final int EIGHT = 5;
static final int NINE = 6;
static final int TEN = 7;
static final int JACK = 8;
static final int QUEEN = 9;
static final int KING = 10;
static final int ACE = 11;
static final int DECUE = 12;
//��С��
static final int BLACK = 13;
static final int COLOR = 14;
public Card() {
	super();
	// TODO Auto-generated constructor stub
}
public Card(int rank, int sult) {
	
	this.rank = rank;
	this.sult = sult;
}
static final String[] SUIT_NAME = {"����","����","��Ƭ","÷��",""};
static final String[] Rank_Name = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","С��","����"};

public int getRank() {
	return rank;
}
public void setRank(int rank) {
	if (rank < THREE || rank > COLOR) {
		throw new RuntimeException("����");
	}
	this.rank = rank;
}
public int getSult() {
	return sult;
}
public void setSult(int sult) {
	if (sult < HEART || sult >JOKER) {
		throw new RuntimeException("����");
	}
	this.sult = sult;
}
@Override
public String toString() {
	return SUIT_NAME[sult]+Rank_Name[rank];
}



}
