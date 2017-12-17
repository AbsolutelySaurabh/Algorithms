package Algos;
import java.util.*;
public class ReducedString {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		String input = s.next();
		
//		The logic is "We'll use stack, 
//		if the str[index] matches the top element of the stack, then
//		we'll pop() the stack and move on to t+1,
//		else if it does not matches then we'll push() str[index] to stack and move to next index;
		
		String result = printReduced(input);
		if(result.equals(' ')){
			System.out.println("Empty String");
		}else{
			System.out.println(result);
		}
		
		s.close();
	}
	
	public static String reverseString(String str, int index, String ans){
		
		if(index==0){
			ans+=str.charAt(index);
			return ans;
		}
		
		ans+=str.charAt(index);
		return reverseString(str, --index, ans);
		
	}
	
	
	public static String printReduced(String input){
		
		//Character is a wrapper class for char, like Integer for int						
		Stack<Character> s = new Stack();
		s.push(' ');
		int index=0;
		while(index<input.length()){
			if(s.peek() == input.charAt(index)){
				s.pop();
			}else{
				s.push(input.charAt(index));
			}
			index++;
		}
		
		if(s.size()==1){
			return "Empty String";
			}
		
		//Then form string with the stack
		String ans = "";
		while(!s.isEmpty()){
			ans+=s.pop();
		}
		ans = ans.substring(0, ans.length()-1);
		return reverseString(ans, ans.length()-1, "");
	
	}
	
	}

