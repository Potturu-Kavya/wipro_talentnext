import java.util.*;
public class Median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
		}
		if(n%2!=0) {
			int median=n/2;
			System.out.print("["+arr1[median]+" , "+arr2[median]+"]");
			
			
			
		}
		

	}

}
