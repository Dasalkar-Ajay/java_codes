import java.io.*;

class Employee {
	int empId;
	String empName;
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
}

class SerialDemo{
	public static void main(String[] args)throws IOException{
		FileOutputStream foso=new FileOutputStream("ajay.txt");
		ObjectOutputStream oos=new ObjectOutputStream(foso);
		Employee obj=new Employee(1,"Rahul");
		oos.writeObject(obj);

		oos.close();
		foso.close();
	}
}
