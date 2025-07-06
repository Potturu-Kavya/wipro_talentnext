import java.util.*;

public class SumandAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int sum=0;
		double avg=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			avg=sum/n;
			
			
		}
		System.out.println("Sum of array elements" +sum);
		System.out.println("Average of array elements" +avg);
		

	}

}
