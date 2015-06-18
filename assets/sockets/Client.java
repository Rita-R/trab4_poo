package assets.sockets;

//importing our assets...

//importing Java packages...
import java.io.*;
import java.util.*;
import java.net.*;

public class Client{
	Socket cclient;
	
	public void connection(String servAdress)throws IOException, UnknownHostException{
		this.cclient = new Socket(servAdress,12345)	;
	}
	
	public void close()throws IOException{
		this.cclient.close();
	}
}
