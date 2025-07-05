import java.util.*;
public class Primeseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0) {
				System.out.println(i+" ");
				
			}
		}

	}

}
