//Command Design Pattern by Jay-Rads Villanueva
public class FireCommand implements Command
{
	Player player;
	
	public FireCommand(Player key)
	{
		this.player=key;
	}
	public void execute()
	{
		player.fire();
	}
	public String getName()
	{
		return "Player Fire";
	}
}
