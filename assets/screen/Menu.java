package assets.screen;

//Importing our assets...
import assets.screen.*;

//Importing Java packages...
import java.io.*;
import java.util.*;

public class Menu extends screen_utils{
	Scanner sc;
	Controller control;

	public Menu(){
		this.sc = new Scanner(System.in);
		this.control = new Controller();
	}

	public void startApp(){
		int quit = 0;
		sc = new Scanner(System.in);

		this.delim();
		this.greetings();
		
		control.mainScreen_controller();

		this.goodbye();
		this.delim();

		System.exit(0);
	}

}