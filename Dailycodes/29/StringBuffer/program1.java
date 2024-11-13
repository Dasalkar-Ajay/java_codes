
class Demo{
	public static void main(String[] args){

		StringBuffer sb = new StringBuffer();
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());

		String str =new String();
		System.out.println(str);

		String str1 =new String();
		System.out.println(str1);
	}
}
