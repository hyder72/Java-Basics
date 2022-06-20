import java.util.Scanner;

public class JaggedTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[][] = new int[3][];// 3 class room and each with diff no of studnets jagged data
		ar[0]=new int[2];
		ar[1]=new int[4];
		ar[2]=new int[3];

		
		
		/* User input from console  to fill array*/
		Scanner scan = new Scanner(System.in);
		
		
		 for(int i=0;i<ar.length;i++) 
		 { 
			 for(int j=0;j<ar[i].length;j++) 
			 {
			  System.out.println("Enter the Marks of class "+i+" Student "+j);
			 ar[i][j]=scan.nextInt(); 
			 }
		 
		 }
		 

		/* storing marks of students directly in program not taking from console */
		/*
		 * ar[0][0]=49; ar[0][1]=45;
		 * 
		 * ar[1][0]=45; ar[1][1]=40; ar[1][2]=45; ar[1][3]=50;
		 * 
		 * ar[2][0]=44; ar[2][1]=49; ar[2][2]=39;
		 */

		/* to display the marks of students stored within array we created */
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");

			}
			System.out.println();

		}

	}

}
