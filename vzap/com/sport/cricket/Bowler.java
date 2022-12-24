package vzap.com.sport.cricket;

public class Bowler extends Cricketer
{
	private int totalWickets;
	private int currentWickets;
	
	public Bowler(String name, String surname, int highestScore, int totalRuns,
			int noOfInnings, int totalWickets)
	{
		super(name, surname, highestScore, totalRuns, noOfInnings);
		this.totalWickets = totalWickets;
	}
	public Bowler(String name, String surname)
	{
		this(name, surname,0,0,0,0);
	}
	
	public void bowl()
	{
		currentWickets = (int)((Math.random() * 2) + 1);
		totalWickets = totalWickets + currentWickets;
		System.out.println(this.getName() + " " + this.getSurname() + " took " +
							currentWickets + " today.");
	}
	
	public void printDetails()
	{
		super.printDetails();
		System.out.println("Wickets taken today " + currentWickets + "\n" +
							"Total wickets is now " + totalWickets);
	}
	
	public void play()
	{
		this.bat();
		this.bowl();
	}
}
