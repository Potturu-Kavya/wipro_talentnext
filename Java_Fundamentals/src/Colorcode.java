import java.util.*;
public class Colorcode {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter color code");
		char c=sc.next().charAt(0);
		switch(c) {
			case 'R':
				System.out.println("Red");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'G':
				System.out.println("Green");
				break;
			case 'O':
				System.out.println("orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("White");
				break;
			default:
				System.out.println("Inavalid Code");
		}
				

	}

}
