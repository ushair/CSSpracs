package MD5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {

	/**
	 * @param args
	 */
public static String getMD5(String io){
	try {
			MessageDigest md= MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(io.getBytes());
			System.out.println("Byte Representation: "+messageDigest);
		
			BigInteger number =new BigInteger(1,messageDigest);
			System.out.println("Number Representation: "+number);
			String hashtxt= number.toString(16);
		
			while (hashtxt.length()<32)
				{
					hashtxt="0"+hashtxt;
				}
			return hashtxt;
		} 
	catch (NoSuchAlgorithmException e )
	{
			throw new RuntimeException(e); 	
	}

}
	public static void main(String[] args) throws NoSuchAlgorithmException,IOException {
		
		System.out.println("Enter the String :- ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String txt = br.readLine();
		System.out.println("Hash Value: "+getMD5(txt));
	}

}
