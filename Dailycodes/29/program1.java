class Demo{
	public static void main(String[] args){

		String str1 = new String("ajay");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));


		 str1 = str1 +" Dasalkar";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		 str1 = str1 + "  Scoe ";
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}

