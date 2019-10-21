//Command Design Pattern by Jay-Rads Villanueva
public class JumpCommand implements Command
{
	Player player;
	
	public JumpCommand(Player key)
	{
		this.player=key;
	}
	public void execute()
	{
		player.jump();
	}
	public String getName()
	{
		return "Player Jump";
	}
}
