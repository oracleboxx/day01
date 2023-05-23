package day03;

import java.util.Scanner;

public class for_test5 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
	String name = null;
		 int total =0;
		
		
		while(true) {
		
			System.out.print("1.계좌\t");
			System.out.print("\t2.개설 조회");
			System.out.print("\t3.입출금\t");
			System.out.print("\t4.종료");
			int num =input.nextInt();
			switch(num) {
			case 1:
					name =input.next();
					
					break;
			case 2:
					System.out.println("계좌주명:"+name);
					break;
			case 3: 
					while(true) {
					System.out.print("1.입금\t");
					System.out.print("\t2.출금\t");
					System.out.print("\t3.잔액조회\t");
					System.out.print("\t4.종료");
					
					int num2 = input.nextInt();
					if(num2 == 1) {
						System.out.println("입금할 금액");
						int money = input.nextInt();
						 total +=money;
					
					}
					else if(num2 == 2) {
						System.out.println("출금할 금액");
						 int money2 =input.nextInt();
						 total -=money2;
					}
					else if(num2 == 3) {
						System.out.println("잔액 조회:"+total);
					}
					else if(num2 ==4) {
						System.out.println("종료 합니다");
						break;
						
					}
					
					}
					
					continue;
			case 4: 
					System.out.println("종료합니다");
					return;
					
			}//while
			
		}//main
	}//class
}
