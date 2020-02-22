package homework;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int random = rd.nextInt(9999) + 9999;
		System.out.println("Number RanDom : "+ random);
		checkSymmetry(random);
	}

	private static void checkSymmetry(int a) {
		int temp=a;
		String inverse = "";
		while (a > 0) {
			inverse += a % 10;
			a /= 10;
		}
		System.out.println("Number inverse: "+inverse);
		if(String.valueOf(temp).equals(inverse)) {
			System.out.println("Symmetry!!!");
		}else {
			System.out.println("Not Symmetry!!!");
		}
	}
}
