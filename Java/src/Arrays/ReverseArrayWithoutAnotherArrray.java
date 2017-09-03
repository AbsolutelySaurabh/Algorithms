package Arrays;
import java.util.*;

public class ReverseArrayWithoutAnotherArrray {

	public static Scanner s;
	public static void main(String []args){
		
		s = new Scanner(System.in);
		
		ArrayList arr = new ArrayList();
		System.out.println("Enter the array: ");
		int n = s.nextInt();
		while(n!=-1){
			
			arr.add(n);
			n = s.nextInt();						
		}
		
		ArrayList temp_reverse = arr;
		ArrayList reversed = ReverseArray(temp_reverse, (int)temp_reverse.get(0), (int)temp_reverse.get(temp_reverse.size()-1),
				0, temp_reverse.size()-1);
		
		System.out.println("After reversing : ");
		print(reversed, 0);
		
	}
	
	public static ArrayList ReverseArray(ArrayList arr, int head, int tail, int startIndex, int endIndex ){
				
		if(startIndex==endIndex || startIndex>endIndex){
			
			return arr;
		}
		
		int temp = (int)(arr.get(startIndex));
		arr.set(startIndex, arr.get(endIndex));
		arr.set(endIndex, temp);
		
		return ReverseArray( arr,  head,  tail, ++ startIndex, -- endIndex );

	}
	
	public static void print(ArrayList arr, int index){
		
		if(index == arr.size()){
			return;
		}
		
		System.out.print(arr.get(index)+" , ");
		print( arr, ++index);
		
	}
	
}
