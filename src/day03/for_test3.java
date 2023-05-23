package day03;

import java.util.Scanner;

public class for_test3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int a =0 , b=0;
		System.out.println("반복 숫자");
		int c =sc.nextInt();
		
		for(int i=0 ; i<5; i++) {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.printf("결과 값:%d",a+b);
			
			
			}
		
			

	}

}
