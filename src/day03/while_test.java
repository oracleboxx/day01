package day03;

import java.util.Scanner;

public class while_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		String name ;
		while(true) {
			System.out.println("이름 입력");
			System.out.println(">>>>:");
			name = sc.next();
			System.out.println("당신 이름"+name);
			
		}
	}
}