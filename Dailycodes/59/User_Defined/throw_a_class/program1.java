
class Demo extends Exception{
		System.out.println("mg kas vatl exception");

}

class client{
	public static void main(String[] args){
	try{	throw new Demo();
	} catch(Demo d){
		
		System.out.println("hii");
		System.out.println(d);
	}
	}
}

