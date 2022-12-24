import vzap.com.sport.Player;
import vzap.com.sport.cricket.Bowler;
import vzap.com.sport.cricket.Cricketer;
import vzap.com.sport.cricket.Keeper;

//comment for svn
public class CricketMatch {
	public static void main(String[] args) {
		Player[] team;
		team = new Cricketer[] { 
				new Cricketer("Dave", "Mathews"),
				new Cricketer("Jon","Bon Jovi"),
				new Cricketer("ben","affleck"),
				new Cricketer("Mark", "Damon"), 
				new Cricketer("Ronan", "Keating"),
				new Bowler("Mathew", "Perry"),
				new Bowler("Stan", "Woncheck"),
				new Bowler("Brad", "Pitt"),
				new Bowler("Harrison", "Ford"),
				new Bowler("Stevan", "Segal"),
				new Keeper("Chris", "Sodenbirg")
				};
		for (int pos = 0; pos < team.length; pos++) {
			team[pos].play();
			team[pos].printDetails();
		}
	}
}
