package day01;

import java.util.Scanner;

public class hol {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	System.out.println("숫자 입력:");
	int num =(num%4 == 0) ? "짝수" : "홀수";
		System.out.println(num);
	if(num<0) {
		
		System.out.println("음수");
	}
	else if(num>0) {
		System.out.println("양수");
	}
	

}
}
