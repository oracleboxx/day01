package day03;

public class for_test {

	public static void main(String[] args) {
		 
		int sum=0;
		for(int i =2 ; i<=9 ; i++) {
			System.out.printf("%d단\n",i);
			for(int j=1 ; j<=9; j++) {
				System.out.printf("\t%d * %d: %d\n",i,j,i*j);
			}
		}
		
	}

}
