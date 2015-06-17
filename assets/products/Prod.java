package assets.products;

//importing our assets...

//importing Java packages...
import java.io.*;
import java.util.*;

/*
	a classe Prod necessita de:
	nome
	preço
	disponibilidade
	número de volumes.

	getters e setters já implementados.
*/


public class Prod{
	String name;
	float price;
	boolean available;
	int nprods;
	Scanner sc;

	public Prod(int products){
		setProdName();
		setProdPrice();
		setDisponibility(true);
		setNumberOfProducts(products);
	}
	void setProdName(){
		this.sc=new Scanner(System.in);
		this.name = sc.nextLine();
	}
	
	void setProdPrice(){
		this.sc = new Scanner(System.in);
		this.price = sc.nextFloat();
	}

	void setDisponibility(boolean value){
		this.available=value;
	}	

	void setNumberOfProducts(int nitens){
		this.nprods=nitens;
	}

	String getProdName(){
		return this.name;
	}
	boolean getDisponibility(){
		return this.available;
	}
	float getPrice(){
		return this.price;
	}
}
