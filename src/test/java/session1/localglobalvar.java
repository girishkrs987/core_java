package session1;
public class localglobalvar{
	
	
	int ssn=234;
	
	String name="girish";
	
	
	public static void main(String[] args) {
		
		
		int i =10; 
		localglobalvar obj1  = new localglobalvar();
		
		System.out.println("from manin metho"+obj1.name);
		System.out.println("from manin metho"+obj1.ssn);
		
		sum(); 
		
		System.out.println(x);
		
		
		//System.out.println(i);
	}
	
	
	public static void sum() {
		
	int x=10;
//		int y=20;
//		int z=x+y;
//		System.out.println(z);
	localglobalvar obj  = new localglobalvar();
//		
		//obj.ssn=678;	obj.name="abhiskeh"; 
		System.out.println("these vaues are getting from methods"+obj.ssn);
		System.out.println("these vaues are getting from methods"+obj.name);
//		
	}
	public static void sum() {}
	
	
	
	
	
}