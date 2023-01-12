import java.util.Scanner;

public class findPrimeNumber {

	public static void main(String[] args) {
		// write a java program to find prime numbers
		Scanner scanner=new Scanner(System.in);
		System.out.print("write your number");
		int num= scanner.nextInt();
		int counter=0;
		
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=num;j++) {
				int resut = i*j;
				if(resut== num) {
					counter=counter+1;
					
					             }
				                      }
		                           } 
		if(counter==2) {
			System.out.println( num+" is prime number");
			           }
		else {
			System.out.println(num+"this is not prime number");
			}
	}

}
