package 종합실습과제;

import java.util.Scanner;

public class 문제11_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a + b) / 2 >= 60 & a >= 40 & b >= 40) {
			System.out.printf("합격");
		} else if ((a + b) / 2 >= 60 & a <= 40 | b >= 40) {
			System.out.printf("불합격(과락)");
		} else {
			System.out.printf("불합격");
		}
	}

}

