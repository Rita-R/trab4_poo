import java.util.*;
import java.io.*;
import java.net.*;



public class Server implements Runnable{
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
		PrintStream pr = new PrintStream(this.client.getOutputStream());
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			pr.println("Server says: "+sc.nextLine());
		}
		pr.close();
		sc.close();
	}
	public void finishing()throws IOException{
		this.client.close();
		this.sk.close();
	}

	public void run(){
		try{
			send2User();
		}	
		catch(IOException badConnection){
			System.out.println("bad connection")		;
		}
	}
}
