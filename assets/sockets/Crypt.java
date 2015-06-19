package assets.sockets;

//importing our assets...

//importing Java packages...
import java.util.*;
import java.lang.*;
import java.security.MessageDigest;

public class Crypt{

	private String convertToHex(byte[] data){
		StringBuffer buf = new StringBuffer();

		for (int i = 0; i < data.length; i++){
			int halfbyte = (data[i] >>> 4) & 0x0F;
			int two_halfs = 0;
			do {
				if ((0 <= halfbyte) && (halfbyte <= 9))
					buf.append((char) ('0' + halfbyte));
				else
					buf.append((char) ('a' + (halfbyte - 10)));
				halfbyte = data[i] & 0x0F;
			} while(two_halfs++ < 1);
		}

		return buf.toString();
	}

	public String encrypt(String password) throws Exception{
		String encrypted;

		java.security.MessageDigest d = null;
    	d = java.security.MessageDigest.getInstance("SHA-1");
    	d.reset();
    	d.update(password.getBytes());

    	encrypted = this.convertToHex(d.digest());

		return encrypted;
	}

}