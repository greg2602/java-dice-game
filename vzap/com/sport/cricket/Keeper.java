package vzap.com.sport.cricket;

public class Keeper extends Cricketer
{
	private int totalCatches;
	private int currentCatches;
	public Keeper(String name, String surname, int highestScore, int totalRuns,
			int noOfInnings,int totalCatches)
	{
		super(name, surname, highestScore, totalRuns, noOfInnings);
		this.totalCatches = totalCatches;
	}
	public Keeper(String name, String surname)
	{
		this(name, surname,0,0,0,0);
	}
	public void keepWicket()
	{
		currentCatches = (int)((Math.random()* 11));
		System.out.println(this.getName() + " " + this.getSurname() +
				" took " + currentCatches + " chatch(es) behind the stumps.");
	}
	public void printDetails()
	{
		super.printDetails();
		System.out.println(" and took " + currentCatches + " today.\n" +
							"Total catches is now " + totalCatches);
	}
	
	public void play()
	{
		this.bat();
		this.keepWicket();
	}
}
