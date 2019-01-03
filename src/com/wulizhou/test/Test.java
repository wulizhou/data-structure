package com.wulizhou.test;

import com.wulizhou.sort.Sort;

public class Test {


	public static void print(int[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + "\t");
		}
	}

	public static void main(String[] args) {
		int[] data = { 3, 5, 7, 2, 6, 4, 9, 1, 8, 10, 2 };
		Sort.bubbleSort(data);
		print(data);
		
	}

}
