package vzap.com.sport;

public abstract class Player
{
	private String name = null;
	private String surname = null;
	public Player(String name, String surname)
	{
		this.name = name;
		this.surname = surname;
	}
	public String getName()
	{
		return name;
	}
	public String getSurname()
	{
		return surname;
	}
	
	public abstract void play();
	public abstract void printDetails();
}
