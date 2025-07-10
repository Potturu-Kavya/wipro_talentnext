import java.util.*;
public class StringJoiner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner sj1=new StringJoiner("-");
		StringJoiner sj2=new StringJoiner("-");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of cities in sj1");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			String s1=sc.nextLine();
			sj1.add(s1);
			
		}
		System.out.println("Enter the no of cities in sj2");
		int n1=sc.nextInt();
		for(int i=0;i<=n1;i++) {
			String s2=sc.nextLine();
			sj2.add(s2);
		}
		System.out.println(sj1.merge(sj2));
		System.out.println(sj2.merge(sj1));

	}

}
