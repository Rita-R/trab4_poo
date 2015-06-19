import java.util.*;
import java.io.*;
import java.net.*;




public class main{
	public static void main(String[] args){
		Client cl = new Client();
		Thread tr = new Thread(cl);
		try{
			cl.connect("127.0.0.1");
			tr.start();
			cl.sendMessage();
			cl.finishing();
		}
		catch(IOException badConnection){
				System.out.println("bad connection");
		}
	}

}
