//Command Design Pattern by Jay-Rads Villanueva
public class InputHandler 
{
	Player player;
	public InputHandler(Player p)
	{
		this.player=p;
	}
	public void buttonPressed(String s)
	{
		if(s.equals("run"))
		{
			RunCommand x= new RunCommand(player);
			x.execute();
		}
		else if(s.equals("jump"))
		{
			JumpCommand x= new JumpCommand(player);
			x.execute();
		}
		else if(s.equals("fire"))
		{
			FireCommand x= new FireCommand(player);
			x.execute();
		}
		else if(s.equals("quit"))
		{
			QuitCommand x= new QuitCommand(player);
			x.execute();
		}
	}
}
