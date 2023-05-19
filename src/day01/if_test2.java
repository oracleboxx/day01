package day01;
import java.util.Scanner;
public class if_test2 {

	public static void main(String[] args) {
		String s1 ,s2 ;
		Scanner sc =new Scanner(System.in);
		System.out.println("첫 문자열 입력");
		s1 =sc.next();
		System.out.println("두 문자열 입력");
		s2 =sc.next();
		if(s1.equals(s2)) {
			System.out.println("s1과 s2는 같다");
		}
		else {
			System.out.println("s1과 s2는 같지 않다");
			
		}
	}

}
