package com.test;

import java.util.Arrays;

public class test03 {
public static void main(String[] args) {
	String str = "ͳ���ַ������ַ��е�����λ��";
	char ch = '��';
	int[] count = count(str,ch);
	System.out.println(Arrays.toString(count));
}
public static int[] count(String str,char ch){
	int[] count = {};
	for(int i=0;i<str.length();i++){
		char c = str.charAt(i);
		if(c==ch){
			//��չ����
			count = Arrays.copyOf(count,count.length+1);
			//������i
			count[count.length-1] = i;
		}
	}
	return count;
}
}
