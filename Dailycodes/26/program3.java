class Demo{
	public static void main(String[] args){

	char char1='A';
	char char4='A';
	char char2='B';
	char char3='a';

	int a=10;
	int b=10;


	System.out.println(System.identityHashCode(char1));
	System.out.println(System.identityHashCode(char4));
	System.out.println(System.identityHashCode(char2));
	System.out.println(System.identityHashCode(char3));
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	


	}
}
