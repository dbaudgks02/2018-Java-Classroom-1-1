package 종합실습과제;

import java.util.Scanner;

public class 문제21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int sum = 0;
		int n = sc.nextInt();
		for (a = 1; a <= n; a++)
			sum += a * a;
		System.out.printf("자연수 n: %d\n", n);
		System.out.printf("결과: %d", sum);

	}

}
