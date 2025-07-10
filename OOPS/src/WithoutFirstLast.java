import java.util.*;
public class WithoutFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=1;i<s.length()-1;i++) {
			System.out.print(s.charAt(i));
			
		}
		

	}

}
