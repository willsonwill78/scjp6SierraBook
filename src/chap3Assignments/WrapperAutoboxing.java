package chap3Assignments;

public class WrapperAutoboxing {

	public void wrapperMethod(){
		
		Integer i1 = new Integer(34);
		Integer i2 = new Integer("34");
		Boolean b1 = new Boolean(true);
		Boolean b22 = new Boolean("tRUe");
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("flas");
		Boolean b4 = new Boolean("false");
		Boolean b5 = new Boolean(null);
		Character c1 = new Character('B');
		
		System.out.println("Integer i1 :" + i1);
		System.out.println("Integer i2 :" + i2);
		System.out.println("Boolean b1 :" + b1);
		System.out.println("Boolean b22 :" + b22);
		System.out.println("Boolean b2 :" + b2);
		System.out.println("Boolean b3 :" + b3);
		System.out.println("Boolean b4 :" + b4);
		System.out.println("Boolean b5 :" + b5);
		System.out.println("Character c1 :" + c1);
	}
	
	public void valueOfParseXxxMethod(){
		
		Integer i1 = Integer.valueOf(34);
		int i11 = i1.intValue();
		int i111 = Integer.parseInt("34");
		Float i2 = Float.valueOf("34.56");
		float i22 = i2.floatValue();
		float i222 = Float.parseFloat("34.56");
		Boolean b1 = new Boolean(true);
		boolean b11 = b1.booleanValue();
		boolean b111 = Boolean.parseBoolean("");
		
		System.out.println(" \nInteger i1 : " + i1 + " i11 valuOf :"  
				+ i11 +  " int i111 parseOf :" + i111);
		System.out.println("Integer i2 :" + i2 + " i22 valuOf :"  
				+ i22 +  " int i222 parseOf :" + i222);
		System.out.println("Boolean b1 :" + b1 + " b11 valuOf :"  
				+ b11 +  " int b111 parseOf :" + b111);
	}
	
	public void equalsAutoboxingMethod(){
		Integer y = new Integer(346);
		Integer z = new Integer(346);
		if(y==z)
			System.out.println(" \n is == ");
		if(y!=z)
			System.out.println("  is != is true ");
		if(y.equals(z))
			System.out.println("  y.equals(z) is true" );
		if(!y.equals(z))
			System.out.println("   !y.equals(z) is true");
	}
	
	public void autoboxingMethod(){
		Integer y = new Integer(346);
		int m = 346;
		System.out.println(" \nInteger y : " + y++ + " m :" + m++ );
	}

	public void useautoboxingMethod(){
		System.out.println(" \n go(5) : " + go(5) );
	}

	public void boxingMethod(){
		Integer x = null;
		doStuff(x);
	}

	public void doStuff(int z){
		int z3 = 5;
		System.out.println(" \n z3 : " + 
		z );
	}

	public boolean go(Integer i){
		Boolean ifSo = true;
		Short s = 400;
		if(ifSo)
			System.out.println(" \n s : " + ++s );
		return !ifSo;
	}
	
	
}
