package assets.users;

//Importing Java packages...
import java.io.*;
import java.util.*;
import java.time.*;

public class User{
	String name;	// nome
	String address;	// endereço
	String email;	// email
	String password;// senha
	int id;			// id
	boolean type;		// tipo
	Scanner sc;

	// type false -> usuário comum, pode comprar produtos
	// type true -> funcionário, pode cadastrar/remover/atualizar produtos
	void set_UserName(){
		System.out.printf("\t>Digite o nome de usuário: ");
		this.sc = new Scanner(System.in);
		this.name = this.sc.nextLine();
	}
	void set_UserAdress(){
		System.out.printf("\t>Digite o endereço do usuário: ");
		this.sc = new Scanner(System.in);
		this.address = this.sc.nextLine();
	}
	void set_UserEmail(){
		System.out.printf("\t>Digite o email do usuário: ");
		this.sc = new Scanner(System.in);
		this.email = this.sc.nextLine();
	}
	void set_UserType(){
		System.out.printf("\t>Informe o nível de privilégio: ");
		System.out.printf("<Administrador/Comum");
		char verify='k';
		this.sc = new Scanner(System.in);
	
		while(true){
			verify = this.sc.next().charAt(0);
			if(verify=='A'|| verify=='C') break;
			System.out.printf("\t>Inválido. Informe se é Admin ou Comum ");
		}
		if(verify=='A')
				this.type=true;
		else
				this.type=false;
	}
}
