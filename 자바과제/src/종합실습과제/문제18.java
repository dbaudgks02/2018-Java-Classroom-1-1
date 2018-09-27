package 종합실습과제;

import java.util.Scanner;

public class 문제18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		a=sc.next();
		int z='Z';
		char b=a.charAt(0);
		for(char i=b;i<=z;i++) {
			System.out.printf("%c ",i);
		}
	}

}
