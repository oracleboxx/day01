package day01;

import java.util.Scanner;

import java.util.Scanner;
public class if_test4 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
				int H = sc.nextInt();
				int M = sc.nextInt();
				int CT = sc.nextInt();
				if(0 <=CT && CT <=1000) {
					int total = H * 60 + CT + M ; // 
					H = total / 60 ;
					M = total % 60 ;
					if(H>=24) {
						H -= 24; // 
						
					}
					System.out.println(H+":"+M);
				}
	}

}
