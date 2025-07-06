import java.util.*;
public class Search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ele=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				System.out.println("Element found at index "+i);
			    found=true;
			    break;
			}
			
		}
		if(!found) {
			System.out.println(-1);
		}
	
		
		
	}
}
