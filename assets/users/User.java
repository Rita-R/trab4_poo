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
	int type;		// tipo

	// type 0 -> usuário comum, pode comprar produtos
	// type 1 -> funcionário, pode cadastrar/remover/atualizar produtos

	void set_UserName(){;
		System.out.printf("\t>Digite o nome de usuário: ");
		sc = new Scanner(System.in);
		this.name = sc.nextLine();
	}

}
