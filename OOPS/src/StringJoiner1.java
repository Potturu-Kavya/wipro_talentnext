import java.util.*;


public class StringJoiner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj=new StringJoiner("," , "{" , "}");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of names to join");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String str=sc.nextLine();
			sj.add(str);
			
		}
		System.out.println(sj);
		

	}

}
