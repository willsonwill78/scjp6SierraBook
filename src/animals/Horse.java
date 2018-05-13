package animals;

public class Horse extends Animal {

	public void eat() {
		System.out.print("Horse eating hay, oats, " + " and horse treats\n");
	}
	
	public void eat(String s) {
		System.out.print("Horse eating hay, oats, " + " and horse treats :" + s + " \n");
	}

	public void buck() {
		System.out.print("Here we go buck\n");
	}

}
