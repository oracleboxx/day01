package day03;
import java.util.Scanner;

public class test_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home =" ";
		String home2 =" ";
	

		
		
		while(true) {
			System.out.println("1.우리집 등록");
			System.out.println("2.회사 등록");
			System.out.println("3.등록 보기");
			int num = input.nextInt();
			switch(num) {
			case 1 : 
					System.out.println("우리집 ");
					home = input.next();
					break;
			case 2 :
					System.out.println("회사 이름");
					home2 = input.next();
					break;
			case 3 : 
				
					System.out.println("우리집:"+home);
					System.out.println("회사:"+home2);
					break;
			case 4 :
					System.out.println("프로그램 종료");
					return;
			}
			
		
	}

}
}