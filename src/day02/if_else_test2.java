package day02;
import java.util.Scanner;

public class if_else_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("============");
		System.out.println("이름을 정해주세요");
		String name = sc.next();
		System.out.println("닉네임 :"+name+"입니다");
		String job = sc.next();

		String j1 ="검사";
		String j2 ="궁수";
		String j3 ="마법사";
		String j4 ="도적";
	
							
		if(job.equals(j1) ) {
			System.out.println("검사 직업입니다");
			System.out.println("내용이 맞으면 다음으로 넘어갑니다 Yes or No");
		}
		else if(job.equals(j2) ) {
			System.out.println("궁수 직업입니다");
			System.out.println("내용이 맞으면 다음으로 넘어갑니다 Yes or No");
		}
		else if(job.equals(j3) ) {
			System.out.println("마법사 직업입니다");
			System.out.println("내용이 맞으면 다음으로 넘어갑니다 Yes or No");
		}
		else if(job.equals(j4) ) {
			System.out.println("도적 직업입니다");
			System.out.println("내용이 맞으면 다음으로 넘어갑니다 Yes or No");
		}
		else {
			System.out.println("없는 직업입니다");
			
		}

		
		String check = sc.next();
	
		if(check.equals("Yes")) {
			System.out.println("게임을 시작합니다...");
		}
		else if(check.equals("No")) {
			System.out.println("정보를 다시 설정해주세요");
		}
		else {
			System.out.println("잘못 입력했습니다");
		}
		
	}

}
