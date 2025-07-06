import java.util.*;

public class ArraysContais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(info(arr));

	}

	public static boolean info(int  arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1&&arr[i]!=4) {
				return false;
			}
				
			
		}
		return true;
	}

}
