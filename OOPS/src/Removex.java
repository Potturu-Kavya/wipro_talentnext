import java.util.*;
public class Removex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int n=s.length()-1;
		if(s.charAt(0)=='x'&&s.charAt(n)=='x') {
			System.out.println(s.substring(1,n));
		}else {
			System.out.println(s);
		}

	}

}
