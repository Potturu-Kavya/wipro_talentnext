import java.util.*;
public class FirstSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String result="";
		int minLen=Math.min(s1.length(),s2.length());
		for(int i=0;i<minLen;i++) {
			result+=s1.charAt(i);
			result+=s2.charAt(i);
			
		}
		result+=s1.substring(minLen);
		result+=s2.substring(minLen);
		System.out.println(result);

	}

}
