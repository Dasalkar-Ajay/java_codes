class ifelse{
	public static void main(String[] args){
		char ch =97;
		System.out.println(ch+8);
		if(ch=='a'){
			ch+=3;
		//	System.out.println(ch--);
		}else{
			System.out.println(ch++);
		}
		System.out.println(ch+=5);
	}
}