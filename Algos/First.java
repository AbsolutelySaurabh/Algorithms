package Algos;
import java.util.*;
public class First {
	
    static String timeConversion(String s) {
        // Complete this function
        String firstValue = s.substring(0, 2);
        
        String amORpm = s.substring(8, 10);
        if(amORpm.equals("PM")){
        
        	if(Integer.parseInt(firstValue)== 12){
            	
            	firstValue = String.valueOf(12);
            }else{
        	
                firstValue = String.valueOf(Integer.parseInt(firstValue) + 12);
            }
  
        }
        
        if(amORpm.equals("AM")){
        	            
            if(Integer.parseInt(firstValue)== 12){
            	            	
            	firstValue = "00";
            }
        	
        }
        
        String finalValue = firstValue + s.substring(2);
        return finalValue.substring(0, 8);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        
        in.close();
    }

}
