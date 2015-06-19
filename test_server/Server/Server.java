import java.util.*;
import java.io.*;
import java.net.*;



public class Server{
	ServerSocket sk;
	Socket client;


	public void connect()throws IOException{
		this.sk = new ServerSocket(12345);
		this.client=this.sk.accept();
	}	
	

	public void gettingUser()throws IOException{
		Scanner sc = new Scanner(this.client.getInputStream());
		while(sc.hasNextLine()){
			System.out.println("Usuário says: "+sc.nextLine());
		}
		sc.close();
	}
	public void  send2User()throws IOException{
		Scanner sc = new Scanner(System.in);
		PrintStream pr = new PrintStream(this.client.getOutputStream());
		if(sc.hasNextLine()){
			pr.println(sc.nextLine());
		}
		pr.close();
		sc.close();
	}
	public void finishing()throws IOException{
		this.client.close();
		this.sk.close();
	}

}
