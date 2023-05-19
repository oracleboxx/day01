package day01;
import java.util.Scanner;
public class jon {

	public static void main(String[] args) {
	String name;
	int kor;
	int enl;
	int mat;
	int total=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("================\n");
	System.out.println("이름 :");
	name=sc.next();
	System.out.println("국어:");
	kor=sc.nextInt();
	System.out.println("영어:");
	enl=sc.nextInt();
	System.out.println("수학:");
	mat=sc.nextInt();
	System.out.println("==============\n");
	total =kor+enl+mat;
	System.out.println("합계:"+total);
	System.out.println("==============\n");
	
	

	}

}
