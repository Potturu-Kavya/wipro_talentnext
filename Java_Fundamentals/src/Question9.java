	import java.util.*;
	public class Question9 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the age");
    	
    	String gender=sc.nextLine();
    	int age=sc.nextInt();

        

        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.2%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 9.2%");
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                System.out.println("Interest = 8.4%");
            } else if (age >= 59 && age <= 100) {
                System.out.println("Interest = 10.5%");
            }
        } else {
            System.out.println("Invalid gender input.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		if(Character.isLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));
		}else {
			System.out.println(Character.toLowerCase(ch));
			
			
		}
	
	}
}
