
public class Simulator {

	public static void main(String args[]) {
		Batta b1 = new Injured();
		b1.perform();
		
		Batta b2 = new Game();
		b2.perform();
		
		((Injured) b1).gotShot();
		b1.perform();
	}
}
