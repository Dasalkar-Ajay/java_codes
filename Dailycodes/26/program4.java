class Demo{
	public static void main(String[] args){
		char char1='A';
		int a=65;

		System.out.println(System.identityHashCode(char1));
		System.out.println(System.identityHashCode(a));
	}
}
