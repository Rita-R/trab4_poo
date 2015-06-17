package assets.screen;

//Importing Java packages...
import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.event.*;

public class EraserThread implements Runnable{
	private volatile boolean stop;
	private char echochar = '*';

	public EraserThread(String prompt){
		System.out.print(prompt);
	}

	public void run(){
		int priority = Thread.currentThread().getPriority();
      	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

      	try {
			stop = true;
			while(stop){
				System.out.print("\010");	//volta cursor da tela
				System.out.print(echochar);	//escreve mask

				try {
					Thread.currentThread().sleep(3); // delay de sobreescrever
				} catch (InterruptedException ie){
					Thread.currentThread().interrupt();
					return;
				}
			}
		} finally { // restore the original priority
        	Thread.currentThread().setPriority(priority);
      	}
	}

	public void stopMasking(){
		this.stop = false;
	}
}