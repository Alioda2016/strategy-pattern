
public abstract class Batta {

	private int id;
	private String name;
	private static int counter = 0;
	protected FlyBehavior behavior; 
	
	Batta(){
		this.id=counter++;
		this.name="Batta"+this.id;
		this.behavior = new FlyWithWings();
	}
	
	public String swim()
	{
		return "I'm swimming";
	}
	
	protected abstract String display(); 
	
	public void perform()
	{
		System.out.println("I am: " + this.name);
		System.out.println(this.swim());
		System.out.println(display());
		System.out.println(this.behavior.fly());
	}
}
