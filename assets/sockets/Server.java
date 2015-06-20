package assets.sockets;

//importing our assets...
import assets.sockets.Crypt;
import assets.products.*;
import assets.users.*;
//importing Java packages...
import java.io.*;
import java.util.*;
import java.net.*;
import java.awt.event.*;
import java.lang.Thread;

public class Server implements Runnable{
	Crypt crypt = new Crypt();
	ServerSocket sk;
	Socket client;

	public void signUp(){
		Scanner sc = new Scanner(System.in);
		Console cons = System.console();
		String username = "";
		String password = "";
		String repass = "";
		int ok = 0;
		
		System.out.printf("\n	Username: ");
		username = sc.next();

		while(ok == 0){
			password = new String(cons.readPassword("\tPassword: "));

			repass = new String(cons.readPassword("\tRetype Password: "));

			try{
				if(crypt.encrypt(password).equals(crypt.encrypt(repass))) ok = 1;
				else System.out.println("\tPasswords don't match D:\n");
			} catch (Exception crypt_error){
				return;
			}
		}

		System.out.println("\tPasswords match :D\n");
		System.out.println("		Password: " + password);
		try {
			System.out.println("		Encrypted: " + crypt.encrypt(password));
		} catch (Exception crypt_error){
			return;
		}
	}

	public void run(){}


	public void serverUp()throws IOException{
		this.sk = new ServerSocket(12345);
	}
	
	public void connect(Socket client){
		this.client = this.sk.accept();
	}
	
	public void close(){
		this.client.close();
		this.sk.close();
	}

	public void registerProd(Prod target)throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("prods.csv",true));
		bw.append(target.getProdName()+" "+target.getPrice+" "+target.getDisponibility()+" "+target.getNumberOfProducts());
		bw.close();
	}
	public void registerUser(User target)throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("users.csv",true));
		bw.append(target.getUserName()+" "+target.getUserAddress+" "+target.getUserEmail()+" "+target.getUserType());
		bw.close();
	}



}
