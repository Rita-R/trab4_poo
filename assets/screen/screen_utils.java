package assets.screen;

//Importing Java packages...
import java.io.*;
import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class screen_utils{

	void getTime(){
		Calendar cal = Calendar.getInstance();
    	cal.getTime();
    	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	System.out.println("\t\t     Relógio: " + sdf.format(cal.getTime()) );
	}

	void screenHeader(){
		System.out.println("\n		 >>Java Market System v0.0<<");
		this.getTime();
	}

	void delim(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" );
	}

	void greetings(){
		System.out.println("\t\t      Olá, usuário :D");
	}

	void goodbye(){
		System.out.println("\n			Até Logo :D");
	}

	void signScreen(){
		this.screenHeader();
	}

	void mainScreen(){
		this.screenHeader();
		System.out.println("\n	[1] Fazer Login");
		System.out.println("	[2] Criar Usuário");
		System.out.println("	[3] Sair do Programa");
	}

}