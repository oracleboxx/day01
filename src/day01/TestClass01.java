package day01;
import java.util.Scanner;
public class TestClass01 {

 public static void main(String []args) {
	 Scanner sc = new Scanner(System.in);
	 int age;
	String name;
	System.out.println("나이입력:");
	age=sc.nextInt();
	System.out.println("이름입력:");
	name=sc.next();
	System.out.println("당신의 나이는"+age+"이군요");
	System.out.println("당신의 이름은_"+name+"이군요");
	
 }

}
