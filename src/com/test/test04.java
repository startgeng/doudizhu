package com.test;

import java.util.Arrays;

public class test04 {
	/**
	 * [7,3,6,4,10]
	 * @param args
	 */
public static void main(String[] args) {
    int[] arr = {7,3,6,4,10};
    arr = bullsort(arr);
    System.out.println(Arrays.toString(arr));
}
public static int[] bullsort(int[] arr){
	for(int i=0;i<arr.length-1;i++){
		for(int j=0;j<arr.length-1-i;j++){
			if (arr[j]>arr[j+1]) {
				int t = arr[j];
			    arr[j] = arr[j+1];
			    arr[j+1] = t;
			}
		}
		
	}
	return arr;
}
}
