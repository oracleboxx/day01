package day01;

public class if_test1 {

	public static void main(String[] args) {
		int num =50;
		if(num > 0 && num <100) {
			System.out.println("0보다 크다");
		}
		if(num<100) {
			System.out.println("0보다 크고 100보다 작다");
		
		else {
			System.out.println("0보다 크고 100보다 크다");
		}
		
	}else {
			System.out.println("비정상");
		}
	}

}
