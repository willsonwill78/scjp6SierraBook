import gameShape.Animatable;
import gameShape.GameShape;
import gameShape.PlayerPiece;
import gameShape.TilePiece;
import layout.Layout;
import selfTestchap2.Bottom;
import selfTestchap2.House;
import selfTestchap2.Redwood;
import selfTestchap2.X;
import selfTestchap2.Y;
import alpha.Alpha;
import alpha.SubSubAlpha;
import animals.Animal;
import animals.Horse;
import cert.Roo;
import chap3Assignments.Init;
import chap3Assignments.PrimitiveTypes;
import chap3Assignments.WrapperAutoboxing;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("apple : " + new Apple().getFruitName());
		System.out.println("zap : " + new Zap().getConstantsValues());
		System.out.println("rr : " + new Roo().doRooThings());
		doShapes(new GameShape());  
		doShapes(new PlayerPiece());
		doShapes(new TilePiece());
		PlayerPiece player = new PlayerPiece();
		Object o = player;
		GameShape shape = player;
		Animatable mover = player;
		player.displayShape();
		shape.displayShape();
		mover.animate();
		Animal animal = new Horse();
		animal.eat();
		Horse horse = new Horse();
		horse.eat();
		animal.eat();
		horse.eat("Apple\n");
		Animal[] ani = { new Animal(), new Horse(), new Animal(), new Horse() };
		for (Animal an : ani) {
			if (an instanceof Horse) {
				((Horse) an).buck();
				((Horse) an).eat();
				((Horse) an).eat("Horse");
			} else {
				System.out.println("\n" + an.getName() );
			}
		}

		Animal a = new Animal();
		Animal ax = new Animal("Zeus");
		System.out.println("\n" + a.getName() + " < > " + ax.getName());
		
		/* Self test chap 2
		 * Question 2 */
		new Bottom("cesar");
		System.out.println();
		/* Self test chap 2
		 * Question 6 */
		X x1 = new X();
		X x2 = new Y();
		Y y1 = new Y();
		((Y)x2).do2();
		/* Self test chap 2
		 * Question 9 */		
		new Redwood().go();
		/* Self test chap 2
		 * Question 12 */
		new SubSubAlpha();
		System.out.println("s: " + Alpha.s);
		/* Self test chap 2
		 * Question 12 */
		new House("x ");
		
		/* chap 3: Assignments*/
		System.out.println(PrimitiveTypes.lenght);
		System.out.println(PrimitiveTypes.c);	
		System.out.println(PrimitiveTypes.lo);
		System.out.println("1233");
		/* chap 3: Assignments
		 * variable scope */
		Layout layout = new Layout();
		
		/* chap 3: Assignments, page 206*/
		PrimitiveTypes typ =  new PrimitiveTypes();
		typ.testArrayInitiator();

		/* chap 3: Assignments, page 211*/
		PrimitiveTypes strTest =  new PrimitiveTypes();
		strTest.StringTest();

		/* chap 3: Assignments, p. 216*/
		PrimitiveTypes primVal =  new PrimitiveTypes();
		primVal.passingPrimitiveVariables(1);

		/* chap 3: Assignments, page 218*/
		PrimitiveTypes.Foo foo =  new PrimitiveTypes().new Foo();
		PrimitiveTypes.Bar b =  new PrimitiveTypes().new Bar();
		foo.changeIt(b);

		/* chap 3: Assignments, Array loop p.227 Sierra Book scjp6 */
		primVal.arrayManipultion();

		/* chap 3: Assignments, Initialization Blocks, p.234 Sierra Book scjp6 */
		Init in = new Init();
		in.doStuff();
		Init ino = new Init(78);
		ino.doStuff();
		
		/* chap 3: Assignments, Wrapper, p.239 Sierra Book scjp6 */
		WrapperAutoboxing wrap = new WrapperAutoboxing();
		wrap.wrapperMethod();
		wrap.valueOfParseXxxMethod();
		wrap.autoboxingMethod();
		wrap.equalsAutoboxingMethod();
		wrap.useautoboxingMethod();
		wrap.boxingMethod();
		
	}

	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
	
	
}
