package session1;

public class datatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// data ypes
		
		int i =10;
		
		float f=23;
		
		char c = 'k';
		String str= "Selenium testing";
		double b = 23.90; 
		boolean  boo = true;
		
		
//		System.out.println(i);
//		System.out.println(f);
//		System.out.println(c);
//		System.out.println(str);
//		System.out.println(b);
//		System.out.println(boo);
		
		// add int data tpe into the array
		
		int a[]= new int [5];
		
		 a[0]= 10;
		 a[1]= 102;
		 a[4]= 140;
		 a[3]= 10;
		 a[2]= 34;
		 
		// a[5]=34;
		 
		 String str1[]=new String[4];
		 
		 str1[0]="selenium";
		str1[1]="agile";
		str1[2]="sprint";
		str1[3]="jva";
		
		
		 Object obj[] = new Object[5];
		 
		/ obj[0]=10;
		 obj[1]=10.67;
		 obj[2]='u';
		 obj[3]="25/3/2019";
		 obj[4]=true; 
		 
		 System.out.println(obj[4]);
		
		 System.out.println("size of the array"+str1.length);
		
		//System.out.println();
		 
		 for (int j=0; j<str1.length;j++) {
			 
			 System.out.println(str1[j]);
		 }
		
		
		
		
	}
	

}
