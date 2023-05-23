package day03;
import java.util.Scanner;

import java.util.Scanner;

public class switch_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력: ");
		String msg = sc.next();
		switch(msg) {
		case "안녕" :
				 	System.out.println("안녕");
				 	break;
		case "하세요":
				System.out.println(msg+"입력");
				break;
		}
		System.out.println("다음 문장");
	}

}
