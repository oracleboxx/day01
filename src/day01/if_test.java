package day01;
import java.util.Scanner;
public class if_test {

	public static void main(String[] args) {
		System.out.println("숫자 입력하시오");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(0<num && num<100) {
			System.out.println("정상");
		}
			else {
				System.out.println("비정상");
			}
			
		}
	}


