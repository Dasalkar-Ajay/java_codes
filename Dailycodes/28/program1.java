
class Demo{
	public static void main(String[] args){

		String str1 = new String("ajay");
		String str2 = new String("ajay");
		String str3 = new String("ajay");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

	}
}
