package layout;

public class Layout {

	static int s = 343;

	int x;

	{
		x = 7;
		int x2 = 5;
		System.out.println("\n bloc x: " + x + " x2: " +x2);
	}
	public Layout(){
		
		int y = 0;
		
		for(int u = 0; u < 4; u++){
			y += u + x;
			System.out.println("\n y: " + y + " x: " +x);
		}
	}
	
}
