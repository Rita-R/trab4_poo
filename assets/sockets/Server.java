package assets.sockets;

//importing our assets...
import assets.screen.EraserThread;
import assets.sockets.Crypt;

//importing Java packages...
import java.io.*;
import java.util.*;
import java.lang.Thread;

public class Server{
	Crypt crypt = new Crypt();

	public String maskedPassword(String prompt){
		String password = "";
		EraserThread et = new EraserThread(prompt);

		Thread mask = new Thread(et);
		mask.start();

		Scanner sc = new Scanner(System.in);
		password = sc.nextLine();

		et.stopMasking();
		return password;
	}

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
			password = this.maskedPassword("\tPassword: ");

			repass = this.maskedPassword("\tRetype Password: ");

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

}