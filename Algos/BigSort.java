package Algos;
import java.util.*;
import java.math.*;
public class BigSort {
	
	//we're using Bubble Sort
	
	public static String[] sort(String[] unsorted){
		for(int i=0;i<unsorted.length;i++){
			
			for(int j=0;j<unsorted.length-1;j++){
				
				if((new BigInteger(unsorted[j]).compareTo(new BigInteger(unsorted[j+1])) == 1 )){
					
					String temp = unsorted[j];
					unsorted[j] = unsorted[j+1];
					unsorted[j+1] = temp;
					
				}
			}
		}
		return unsorted;
	}
	
	public static void printArray(String[] sorted, int index){
		if(index==sorted.length){
			return;
		}
		System.out.println(sorted[index]);
		printArray(sorted, ++index);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		String[] unsorted = new String[n];
		for(int i=0;i<n;i++){
			unsorted[i] = s.next();
		}
		
		String[] sorted = sort(unsorted);
		printArray(sorted, 0);
		
	}

}
