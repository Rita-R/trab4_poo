import java.util.*;
import java.io.*;
import java.net.*;




public class main{
	public static void main(String[] args){
		Server sv = new Server();
		Thread tr = new Thread(sv);
		try{
			sv.connect();
			tr.start();
			sv.gettingUser();
			sv.finishing();
		}catch(IOException badConnection){
			System.out.println("Bad connection or cannot get user");		
		}
	}
}
