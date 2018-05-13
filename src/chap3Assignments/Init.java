package chap3Assignments;

public class Init {
	int y;
	public Init() {
		System.out.println("0-arg const");
	}
	
	public Init(int x) {
		System.out.println("1st-arg const");
	}
	{
		y = 4;
		int x2 = 5;
		System.out.println("y =  " + y + " x2 =  " + x2);
	}

	public void doStuff() {
		int m = 0;
		for (int z = 0; z < 4; z++) {
			m += z + y;
			System.out.print(" m = " + m);
		}
	}


	static {
		System.out.println("1st static init");
	}
	{
		System.out.println("1st instance init");
	}
	{
		System.out.println("2nd instance init");
	}
	static {
		System.out.println("2nd static init");
	}

}
