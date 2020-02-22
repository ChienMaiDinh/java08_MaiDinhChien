package homework;

class Ex06 {
	public static void main(String[] args) {
		int n = 2000;
		boolean[] arrSNT = new boolean[n];
		findPrime(arrSNT);
	}

	private static void findPrime(boolean[] arr) {
		// khoi tao 1 mang boolean dc xem mac dinh la so nguyen to
		for (int i = 2; i <= arr.length - 1; i++) {
			arr[i] = true;
		}

		// thuat toan san nguyen to
		// boi so cua so nguyen to se ko phai la so nguyen to
		for (int i = 2; i <= arr.length - 1; i++) {
			if (arr[i] == true) {
				for (int j = 2 * i; j <= arr.length - 1; j += i) {
					arr[j] = false;
				}
			}
		}
		int count = 0;
		for (int i = 2; i <= arr.length - 1; i++) {
			if (arr[i] == true) {
				count++;
				System.out.println(i + " " + count);
				if (count == 200) {
					System.out.println(i + " la so nguyen to thu 200");
					break;
				}
			}
		}
	}
}
