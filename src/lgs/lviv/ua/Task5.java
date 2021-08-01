package lgs.lviv.ua;

import java.util.Random;

public class Task5 {
	public static void main(String[] args) {
		int[] array = new int[10];

		
		Random r = new Random();

		
		for (int i = 0; i < array.length; i++) {
			int rInt = r.nextInt(1000);
			array[i] = rInt;
			System.out.println(array[i]);
		}
		
		int min = array[0];
		int max = array[0];
		
		for (int j = 0; j < array.length; j++) {
			if (min > array[j]) {
				min = array[j];
			}
			
			if (max < array[j]) {
				max = array[j];
			}
		}
		System.out.println("");
		System.out.println("Min " + min + " " + "Max " + max);
	}
}
