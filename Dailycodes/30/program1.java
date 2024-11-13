class Demo{
	public static void main(String[] args){
		String str1 ="ajay";
		String str2 ="Dasalkar";

		System.out.println(str1);
		System.out.println(str2);

		str1.concat(str2);
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.concat(str2));

		str1 = str1.concat(str2);
		str2 =str1.concat(str2);
		System.out.println(str1);
		System.out.println(str2);


	}
}
