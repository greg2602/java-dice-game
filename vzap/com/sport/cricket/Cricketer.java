package vzap.com.sport.cricket;
import vzap.com.Drawing;
import vzap.com.sport.Player;

public class Cricketer extends Player implements Drawing
{
	private int highestScore;
	private int totalRuns;
	private int noOfInnings;
	private int currentScore;
	
	public Cricketer(String name, String surname)
	{
		this(name, surname,0,0,0);
	}
	public Cricketer(String name, String surname, int highestScore,
			int totalRuns, int noOfInnings)
	{
		super(name, surname);
		this.highestScore = highestScore;
		this.totalRuns = totalRuns;
		this.noOfInnings = noOfInnings;
		//this.currentScore = currentScore;
	}

	
	public void bat()
	{
		currentScore = (int)((highestScore + 50) * Math.random());
		System.out.println(this.getName() + " scored " + currentScore);
		if(currentScore > highestScore)
		{
			highestScore = currentScore;
		}
		totalRuns = totalRuns + currentScore;
		noOfInnings++;
	}
	public int getCurrentScore()
	{
		return currentScore;
	}
	
	@Override
	public void printDetails()
	{
		System.out.println(this.getName() + " " + this.getName() + " scored " +
					currentScore + " today.\nBatting average is now " + 
					totalRuns/noOfInnings);
	}
	
	@Override
	public void play()
	{
		this.bat();
	}
	@Override
	public void draw()
	{
		System.out.println("    *");
		System.out.println("  *   *");
		System.out.println("    *");
		System.out.println("    *");
		System.out.println(" ********");
		System.out.println("    *");
		System.out.println("   * *");
		System.out.println("  *   *");
		System.out.println(" *     *");
		
	}
}
