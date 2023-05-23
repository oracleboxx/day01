package day02;
import java.util.Scanner;
public class if_else_test1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int sum;
		sum = num * num2;
		if(sum%2 == 0 ) {
			System.out.println("짝 수");
		}
		else {
			System.out.println("홀 수");
		}
		
	}

}
