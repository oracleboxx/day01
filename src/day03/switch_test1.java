package day03;
import java.util.Scanner;
public class switch_test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("입력: ");
		int num = sc.nextInt();
		System.out.print(num+" ");
		
		
		
	switch(num % 7){
	case 0 :
			System.out.println("일요일");
			break;
	case 1 :
			System.out.println("월요일");
			break;
	case 2 :
			System.out.println("화요일");
			break;
	case 3 :
			System.out.println("수요일");
			break;
	case 4 :
			System.out.println("목요일");
			break;
	case 5 :
			System.out.println("금요일");
			break;
	case 6 :
			System.out.println("토요일");
			break;

			
	}
	

}
}