
public class Hello {

	public static void main(String[] args) 
	{
		int highScorePosition = calculateHighScorePosition(1000);
		displayHighSchoolPosition("Sumit", highScorePosition);
	}
	public static void displayHighSchoolPosition(String playerName, int highScorePosition )
	{
		System.out.println( playerName + "Managed to get into position" 
				+ highScorePosition + " On the high score table");
	
	}
	public static int calculateHighScorePosition(int playerScore)
	{
		if (playerScore >1000)
		{
			return 1;
		}
		else if (playerScore >500 && playerScore < 1000)
		{
			return 2;
		}
		else if (playerScore >100 && playerScore < 500)
		{
			return 3;
		}	
		else 
		{
			return 4;
		}
}
}
