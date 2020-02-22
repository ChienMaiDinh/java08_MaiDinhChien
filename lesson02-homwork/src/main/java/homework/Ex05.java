package homework;

import java.util.Random;

public class Ex05 {
	public static void main(String[] args) {
		//11=1011
		Random rd =new Random();
		int numberTP = rd.nextInt(20)+10;
		System.out.println("so thap phan : "+ numberTP);
		changeTPtoNP(numberTP);
	}

	private static void changeTPtoNP(int numberTP) {
		StringBuilder soNP= new StringBuilder();
		while(numberTP>0) {
			soNP.append(numberTP%2);
			numberTP/=2;
			
		}
		soNP.reverse();
		System.out.println("so nhi phan  : "+soNP);
	}
}
