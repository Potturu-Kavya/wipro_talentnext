import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse+=s.charAt(i);
			
		}
		if(s.equals(reverse)){
			System.out.println("Given stirng is a Palindrome");
			
		}else {
			System.out.println("Given string is not a Palindrome");
		}

	}

}
