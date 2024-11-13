

class Demo{
	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("ajay");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		
		sb =sb.append("Dasalkar");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
	}
}
