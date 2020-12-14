
public class Game extends Batta{

	Game()
	{
		super();
		this.behavior=new FlyNoFly();
	}
	@Override
	protected String display() {
		// TODO Auto-generated method stub
		return "I am a game";
	}

}
