package day01;
import java.util.Scanner;
public class if_ {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num ;
	System.out.println("수 입력");
	num = sc.nextInt();
	if(num%2 == 0 ) {
		System.out.println("짝수");
		
	}
	else if(num%2 !=0) {
		System.out.println("홀 수");
		
	}
	System.out.println("다음 문장들 실행");
	}
	

}
