import java.util.*;
import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{
		Scanner sc = new Scanner (System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter the size of the rows");
				int row=Integer.parseInt(br.readLine());

				System.out.println("Enter the size of the column");
				int col=Integer.parseInt(br.readLine());
				
			int arr[][] =new int[row][col];
		System.out.println("Enter the values of the you wants:");	

		for(int i=0;i<arr.length;i++){
			System.out.println("enter the no you want to print in the row"+i);
			for(int j=0;j<arr.length;j++){
				System.out.println("Enter the number as you want by column by coumn"+j);
				arr[i][j] =Integer.parseInt(br.readLine());
				}
		}
		
		System.out.println("The numberes are as the your pattern");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				

				System.out.print(arr[i][j]+"   ");
				}

				System.out.println();
		}

	
	System.out.println(arr[1][1]);	
	System.out.println(arr[1]);	

	System.out.println(arr);	


	}
}


