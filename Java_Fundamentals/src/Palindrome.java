import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(temp>0) {
			int rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
					
		}
		if(n==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		

			

		

	}

}
