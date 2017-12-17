package sortingAlgos;
import java.util.*;
public class MergeSort {
	
	public static void mergeSort(int[] arr){
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		//using integer array
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		
		mergeSort(arr);
		
		s.close();
	}

}
