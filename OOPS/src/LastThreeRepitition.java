import java.util.*;
public class LastThreeRepitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(s.length()-3,s.length()));
		}
				

		
	}

}
