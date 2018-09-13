package 종합실습과제;

import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("주민등록번호:" + a);
		if (a.charAt(7) == 3 | a.charAt(7) == 1) {
			System.out.printf("성별: 남자");
		} else {
			System.out.println("성별: 여자");
		}
	}
}
