import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			boolean isDuplicates=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicates=true;
					break;
					
					
				}
			}
			if(!isDuplicates) {
					System.out.print(arr[i]+" ");
					
				
				
			}
		}
		

	}

}
