package animals;

public class Animal {

	String name;

	public String getName() {
		return name;
	}

	public Animal(String name) {
		this.name = name;
	}

	public Animal() {
		this(makeRandomName());
	}
	
	

	private static String makeRandomName() {
		// TODO Auto-generated method stub
		int x = (int) (Math.random() * 5);
		String name = new String[] { "Fluffy", "Fido", "Rover", "Spike", "Gigi" }[x];
		return name;
	}

	public void eat() {
		System.out.print("Generic Animal Eating Generically\n");
	}
}
