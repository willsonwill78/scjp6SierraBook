package chap3Assignments;

import java.util.Date;

public class PrimitiveTypes {
	public static int lenght =- 0x0101;
	public static long lo = -0x01F1;
	public static char c = '\n';
	public static int i = (int)lo;
	
	public void testArrayInitiator (){
		Float myArray[] = new Float [10];
		for (Float i : myArray) {
			System.out.println("myArray - i: " + i);
		}
	}

	public void localReferenceObject (){
		Date date = null;
		if( date == null)
			System.out.println(" date is null");
	}
	
	public void StringTest (){
		String x = "Java";
		String y = x;
		System.out.println(" 1st String Test x :" + x + " y :" + y);
		x = x + " Bean ";
		System.out.println(" 2nd String Test x :" + x + " y :" + y);
		String s = "Fred";
		String t = s;
		t.toUpperCase();
		String m = t.toUpperCase();
		System.out.println(" t :" + t + " s :" + s +
				 " m: " + m);
	}
	public void passingPrimitiveVariables(int number){
		number = number + 1;		
		System.out.println(" number " + number);
	}

	public void arrayManipultion (){
		Bar[] bar ={ new Bar("Leo"),new Bar("Marco"),new Bar("Maxime")};
		for (Bar ba: bar)
			System.out.println(" " + ba.name);
	}
	
	public class Bar {
		private String name;
		public Bar(){
		}
		public Bar(String name){
			this.name = name;
		}
		int barNum = 28;
	}
	
	public class Foo {
		Bar myBar = new Bar();
	 public	void changeIt(Bar myBar){
			myBar.barNum = 99;
			System.out.println("myBar.barNum in changeIt is "+ myBar.barNum);
			myBar = new Bar();
			myBar.barNum = 420;
			System.out.println("myBar.barNum in changeIt is now "+ myBar.barNum);
		}
		
	}

}
