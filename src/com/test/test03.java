package com.test;

import java.util.Arrays;

public class test03 {
public static void main(String[] args) {
	String str = "统计字符串在字符中的所有位子";
	char ch = '字';
	int[] count = count(str,ch);
	System.out.println(Arrays.toString(count));
}
public static int[] count(String str,char ch){
	int[] count = {};
	for(int i=0;i<str.length();i++){
		char c = str.charAt(i);
		if(c==ch){
			//扩展数组
			count = Arrays.copyOf(count,count.length+1);
			//添加序号i
			count[count.length-1] = i;
		}
	}
	return count;
}
}
