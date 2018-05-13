package selfTestchap2;

public class Redwood extends Tree {
	public void go() {
		go2(new Tree(), new Redwood());
	}

	private void go2(Tree tree, Redwood redwood) {
		// TODO Auto-generated method stub
		Redwood r2 = (Redwood) redwood;
		Tree t2 = (Tree) tree;
		System.out.println("\n go2");
	}

}
