package day01;
import java.util.Scanner;
public class else_ifTest {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0은 잘못입력");
		}
		else if(num%3 == 0 && num% 4 == 0) {
			System.out.println("3,4의 배수입니다");
		}
		else if(num % 3 == 0 ) {
			System.out.println("3의 배수입니다");
			
		}
		else if(num%4 == 0 ) {
			System.out.println("4의 배수입니다");
		}
		
		else {
			System.out.println("0은 잘못입력했습니다");
		}
		
	}
	

}
