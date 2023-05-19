package day01;
import java.util.Scanner;
public class if_two {

	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("숫자 입력");
	int num = sc.nextInt();
	
	if(num%3 == 0) {
		System.out.println("3의 배수 값");
	}
	else {
		System.out.println("3의 배수 아님");
	}
	System.out.println("다음 문장들 실행");
	
}// main
}// class