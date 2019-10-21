//Command Design Pattern by Jay-Rads Villanueva
public class QuitCommand implements Command
{
	Player player;
	
	public QuitCommand(Player key)
	{
		this.player=key;
	}
	public void execute()
	{
		player.quit();
	}
	public String getName()
	{
		return "Player Quit";
	}
}
