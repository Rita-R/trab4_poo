import java.util.*;
import java.io.*;
import java.net.*;





public class Client{
	Socket sk;
	

	public void connect(String host) throws UnknownHostException,IOException{
		this.sk = new Socket(host,12345);
	}
	public void sendMessage()throws IOException{
		PrintStream out= new PrintStream(this.sk.getOutputStream());
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			out.println(sc.nextLine());
		}
		out.close();
		sc.close();
	}
	public void getMessage()throws IOException{
		Scanner sc = new Scanner(this.sk.getInputStream());
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	public void finishing()throws IOException{
		this.sk.close();
	}

	
}
