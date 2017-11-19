package strings;
import java.util.*;
public class CheckReverse {
	
	//Using recursion
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		String i_1 = s.nextLine();
		String i_2 = s.nextLine();
		
		if(ifReverseOfOtherString(i_1, i_2)){
			
			System.out.print("true");
		}else{
			
			System.out.println("false");
		}
		
	}
	
	public static boolean helper(String input1, String input2){
		
		if(input1.length()==0){
			return true;
		}
		
		if(input1.charAt(0) == input2.charAt(input2.length()-1)){
			
			return helper(input1.substring(1), input2.substring(0, input2.length()-1));
			
		}else{
			
			return false;
		}
		
	}
	
	public static boolean ifReverseOfOtherString(String input1, String input2) {
		// Write your code here
      
      if(input1.length() != input2.length()){
        
        return false;
        
      }else{
    	  
    	  return helper(input1,input2);
    	  
      }
     
	}

}
