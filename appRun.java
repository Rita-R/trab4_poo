//importing our assets...
import assets.screen.*;
import assets.sockets.*;

//importing Java packages...

public class appRun{
	Controller con;
	EraserThread et;
	Server server;
	Crypt crypt;

	public static void main(String[] args){
		Menu screen = new Menu();
		screen.startApp();
	}
}