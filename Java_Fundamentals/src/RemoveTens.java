import java.util.*;

public class RemoveTens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] == 10) {
			
				arr[i] = 0;
				

			}
		}
		int index=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
				
			}
		}
		while(index<n) {
			arr[index]=0;
			index++;
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
