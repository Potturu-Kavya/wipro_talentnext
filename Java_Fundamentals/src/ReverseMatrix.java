import java.util.*;
public class ReverseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows and columns");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int mat[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
