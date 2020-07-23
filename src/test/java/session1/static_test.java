package session1;

public class static_test {

	
   int ssn=2399994; // ssn its non static varivale 
  
  static  int  in=234; // in is a static avriable 
  
String name="girish";
	
	public static void main(String[] args) {
		
		static_test obj= new static_test();
		
		System.out.println(obj.ssn);

		System.out.println(in);
		
		obj.sum(5, 10);
		multiplaction(5, 10);
	}
	
	
	public void sum(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
		
		System.out.println(name);
		
		
	}
	
  public static void multiplaction(int a, int b) {
		
		int c=a*b;
		
		System.out.println(c);
	}

}
