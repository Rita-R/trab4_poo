import java.util.*;
import java.io.*;
import java.net.*;




public class main{
	public static void main(String[] args){
		Server sv = new Server();

		try{
			sv.connect();
			sv.gettingUser();
			sv.send2User();
			sv.finishing();
		}catch(IOException badConnection){
			System.out.println("Bad connection or cannot get user");		
		}
	}
}
