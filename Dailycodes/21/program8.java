import java.io.*;

class Demo{
	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of the company:");
		String comapany=br.readLine();
		System.out.println("name of the company is:"+comapany);

		System.out.println("Enter the name of the employee:");
		String emp=br.readLine();
		System.out.println("the employee is:"+emp);
		
		System.out.println("Enter the empId:");
		int empid=Integer.parseInt(br.readLine());
		System.out.println("empid is:"+empid);
		
		System.out.println("Enter the salary:");
		float salary=Float.parseFloat(br.readLine());
		System.out.println("the salary is:"+salary);
		
	}
}
