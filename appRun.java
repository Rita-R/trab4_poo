//importing our assets...
import assets.screen.*;
import assets.sockets.*;

//importing Java packages...
import java.util.*;
import java.io.*;

public class appRun{
	Controller con;
	Server server;
	Crypt crypt;

	public static void main(String[] args){
		Menu screen = new Menu();
		screen.startApp();
	}
}
