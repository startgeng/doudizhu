package com.test;
//统计在这句话中汉字所出现的所有位子
public class test02 {
public static void main(String[] args) {
	for(int i=1;i<=9;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+"*"+i+"="+(i*j)+"\t");
		}
		System.out.println();
	}
}
}
