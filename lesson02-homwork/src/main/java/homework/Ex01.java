package homework;

public class Ex01 {
	public static void main(String[] args) {
		// ko dung bien phu
		int a = 8, b = 5, c = 6;
		show(a, b, c);
	}

	private static void show(int a, int b, int c) {
		if (a == findMinThreeNumber(a, b, c)) {
			if (b == findMinTwoNumber(b, c)) {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(b, c) + " " + c);
			} else {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(b, c) + " " + b);
			}
		} else if (b == findMinThreeNumber(a, b, c)) {
			if (a == findMinTwoNumber(a, c)) {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(a, c) + " " + c);
			} else {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(a, c) + " " + a);
			}
		} else if (c == findMinThreeNumber(a, b, c)) {
			if (b == findMinTwoNumber(b, a)) {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(b, a) + " " + a);
			} else {
				System.out.println(findMinThreeNumber(a, b, c) + " " + findMinTwoNumber(b, a) + " " + b);
			}
		}
	}

	private static int findMinTwoNumber(int a, int b) {
		return (a < b) ? a : b;
	}

	private static int findMinThreeNumber(int a, int b, int c) {
		return (((a < b) ? a : b) < c) ? ((a < b) ? a : b) : c;
	}
}
