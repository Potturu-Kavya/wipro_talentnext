import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		String[] arr= new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.next();
		}
		if(arr.length==0) {
			System.out.println("No Values");
		}else {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]);
				if(i!=arr.length-1) {
					System.out.print(",");
				}
			}
		}

	}

}
