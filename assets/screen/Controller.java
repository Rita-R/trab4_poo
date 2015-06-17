package assets.screen;

//Importing our assets...
import assets.users.*;
import assets.sockets.*;

//Importing Java packages...
import java.io.*;
import java.util.*;

public class Controller extends screen_utils{
	Scanner sc;
	Server server;

	public Controller(){
		this.server = new Server();
		this.sc = new Scanner(System.in);
	}

	//controlador genérico de telas
	//-------------------------------------//
	void mainScreen_controller(){
		int quit = 0;

		while (quit == 0){
			this.mainScreen();

			quit = sc.nextInt();
			switch(quit){
				case 1:
					this.delim();
					quit = 0;
					break;
				case 2:
					this.screenHeader();
					server.signUp();
					this.delim();
					quit = 0;
					break;
				case 3:
					quit = 1;
					break;
				default:
					quit = 0;
					break;
			}
		}

	}

}
