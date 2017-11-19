package strings;
import java.util.*;
public class PrintSubsequences {
	
	public static void main(String[] sr){
		
		Scanner s = new Scanner(System.in);	
		String i = s.nextLine();
		printSubsequences(i);
		
	}
	
	public static void printSubsequencesHelper(String s, String ans){
		if(s.length()==0){
			System.out.println(ans);
			return;
		}
		
		printSubsequencesHelper(s.substring(1), ans + s.charAt(0));
		printSubsequencesHelper(s.substring(1), ans);

		
	}
	
	public static void printSubsequences(String input){
		printSubsequencesHelper(input, "");
	}
}
