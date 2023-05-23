package day03;

import java.util.Scanner;

public class for_test4 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		if(1<=num) {
		for( int i=1; i<10 ;i++) {
			System.out.printf("%d * %d :%d\n",num,i,num*i);
		}
		}
		
	}

}
