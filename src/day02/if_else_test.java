package day02;
import java.util.Scanner;
public class if_else_test {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("나이 : "+age);
		if(20<=age && age<=39) {
			System.out.println("청년");
		
		}
		else if(39<age) {
			System.out.println("중년층");
			
		}
		else if(14<=age && age<=19) {
			System.out.println("청소년");
			
		}
		else {
			System.out.println("어린이");
			
		}
		System.out.println("=======");
	}
	

}
