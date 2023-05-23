package day03;

import java.util.Scanner;

public class for_test2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("반복 횟수 입력:");
		int num = input.nextInt();
		int sum =0 , evensum =0, oddsum =0;
		
		
		for(int i=0 ; i<=10; i++) {
			System.out.printf("%d번 반복\n",num);
			sum += i;
			if(i % 2==0) {
				evensum += i;
			}
			else {
				oddsum += i;
			}
			System.out.println("1~"+num+"까지");
			System.out.println("짝수 합:"+evensum);
			System.out.println("홀수 합:"+oddsum);
			System.out.println("총합 : "+sum);
			System.out.println("다음 문장");
			
		}
	}

}
