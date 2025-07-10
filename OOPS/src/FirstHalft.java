import java.util.*;
public class FirstHalft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int n=s.length();
		if(n%2==0) {
			
			for(int i=0;i<n/2;i++) {
				System.out.print(s.charAt(i));
				
			}
			
		}
		else {
			System.out.println("null");
		}

	}

}
