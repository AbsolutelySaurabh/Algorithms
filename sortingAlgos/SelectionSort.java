package sortingAlgos;
import java.util.*;
public class SelectionSort {
	
	private static int[] selectionSort(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			int min = arr[i];
			for(int j=i+1;j<arr.length ;j++){
				if(arr[j]<min){
					
					min = arr[j];
					int temp  =arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void printArray(int[] arr,int index){
		if(index==arr.length){
			return;
		}
		System.out.println(arr[index]);
		printArray(arr, ++index);
	}
	
	public static void main(String[] args){
		
		//selection sort
		//here we take first element as minimum in the loop and compare with every element 
		//and swap in such a way that we get the minimum on the top.
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		
		int[] newArr = selectionSort(arr);
		printArray(newArr, 0);
		s.close();
	}

}
