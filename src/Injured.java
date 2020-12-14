
public class Injured extends Batta{

	Injured()
	{
		super();
	}
	@Override
	protected String display() {
		// TODO Auto-generated method stub
		return "I am Injured";
	}

	public void gotShot()
	{
		this.behavior= new FlyNoFly();
	}
}
