package Algos;
import java.util.*;
import java.math.*;
public class StringBasic {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		String string = s.next();
		//Changing String value		
		string="hello";
		System.out.println(string);
		
		//find the ASCII 
		System.out.println((int)'a');
		
		//String value of Integers
		char n = s.next().charAt(0);
		System.out.println((int)n);
		
		String str = s.next();
		System.out.println(Integer.parseInt(str));
		
		
		//Accepting very LARGE integer values
		String big = s.next();
		BigInteger bb = new BigInteger(big);
		System.out.println(bb);
		
		//compare BigInteger
		BigInteger b= new BigInteger("100");
		bb.compareTo(b);
		//if > then returns = 1, if < then returns =-1, = if equal
		
	}
	
}
