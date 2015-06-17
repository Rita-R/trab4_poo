package assets.sockets;

//importing our assets...

//importing Java packages...
import java.util.*;
import java.lang.*;
import java.security.MessageDigest;

public class Crypt{

	public String encrypt(String password) throws Exception{
		String encrypted;

		java.security.MessageDigest d = null;
    	d = java.security.MessageDigest.getInstance("SHA-1");
    	d.reset();
    	d.update(password.getBytes());

    	encrypted = new String(d.digest());

		return encrypted;
	}

}