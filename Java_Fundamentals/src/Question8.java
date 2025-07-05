import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter anything");
	
		char ch=sc.next().charAt(0);
		if(ch>='0'&&ch<='9') {
			System.out.println("Digit");
		}else if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			System.out.println("Alphabet");
			
		}else {
			System.out.println("Special Character");
		}

	}

}
