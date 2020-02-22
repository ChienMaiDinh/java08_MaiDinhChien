package homework;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		int arr[] = new int[5];
		ranDom(arr);
		show(arr);
	}

	private static void show(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void ranDom(int[] arr) {
		Random rd = new Random();
		arr[0] = rd.nextInt(11) + 20;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = rd.nextInt(11) + 20;
			for (int j = i - 1; j >= 0; j--) {
				while (arr[i] == arr[j]) {
					arr[i] = rd.nextInt(11) + 20;
					j = i - 1;
				}
			}
		}
	}
}
