package day01;
import java.util.Scanner;
public class protice2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int x;
		int y;
		x =sc.nextInt();
		System.out.println("x값:"+x);
		y =sc.nextInt();
		System.out.println("y값:"+y);
  if(0<x ) 
	  if(0<y) {
	   
		  System.out.println("제1사분면");
	  }
	  else if(0>y) {
		 System.out.println("제4사분면");
	  }
	 
  if(0>x){
	  if(0<y) {
		  System.out.println("제2사분면");
	  }
	  else if(0>y) {
		  System.out.println("제3사분면");
	  }
  }
	  
	  
  }
	}


