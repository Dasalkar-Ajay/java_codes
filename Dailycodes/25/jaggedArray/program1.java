import java.io.*;

class Demo{
	public static void main(String[] args){
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int arr[][] =new int [2][];
		arr[0] =new int[3];
		arr[1]=new int[2];
		for(int i=0; i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
