package com.test;

import java.util.Scanner;

public class test01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int grade = i;
	if(grade==90){
		System.out.println("����");
	}else if (grade==80) {
		System.out.println("�ϸ�");
	}else {
		System.out.println("����");
	}
}


//1.�˷��ھ�

public void test(){
	Scanner sc = new Scanner(System.in);
	int i=sc.nextInt();
	int grade = i;
	switch (grade/10) {
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
	case 7:
		System.out.println("C");
	default:
		System.out.println("������");
		break;
	}
}
}
