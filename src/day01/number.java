package day01;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		
		
		System.out.println("가장 큰 수 찾자");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = sc.nextInt();
		System.out.println("숫자 입력:");
		int num2 = sc.nextInt();
		System.out.println("숫자 입력:");
		int num3 = sc.nextInt();
		
		int max = num;
		if(num2>max) {
			max = num2;
		}
		if(num3>max) {
			max = num3;
		}
		System.out.println("가장큰수"+max+"이다");
		
	}

}
