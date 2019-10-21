//Command Design Pattern by Jay-Rads Villanueva
public class RunCommand implements Command
{
	Player player;
	
	public RunCommand(Player key)
	{
		this.player=key;
	}
	public void execute()
	{
		player.runForward();
	}
	public String getName()
	{
		return "Player ";
	}
}
