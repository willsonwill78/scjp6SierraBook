package gameShape;

public class PlayerPiece extends GameShape implements Animatable {

	public void movePiece() {
		System.out.println("Moving game piece");
	}

	@Override
	public void animate() {
		// TODO Auto-generated method stub
		System.out.println("animating...");
		
	}
}
