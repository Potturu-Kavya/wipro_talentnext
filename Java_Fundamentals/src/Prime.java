import java.util.*;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n==1) {
			System.out.println("Not Prime");
		}else {
			for(int i=2;i<=9;i++) {
				if(n%i==0) {
					System.out.println("Not Prime");
					break;
				}else {
				
					System.out.println("Prime");
					break;
				}
					
				}
				
			
		}

	}

}
