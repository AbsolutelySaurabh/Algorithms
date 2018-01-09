package sortingAlgos;
import java.util.*;
public class QuickSort {
	
	//Quick sort in used by default methods in various languages.
	//It has time complexity of O(n*log(n)) in average case and O(n^2) in worst case.
	//But
	//Here we use constant amount of memory unlike Merge sort, hence quick sort is an in-place algo.
	//We use randomized quick sort in order to avoid worst case scenario.
	//Here qe do not require extra space for merging arrays like in merge sort.
	
	//The logic is take an element( say arr[n-1]) as a pivot.
	//and take partitionIndex = start initially and then run a for loop from (start -> n-1)
	//such that all the elements lesser than pivot are to the left of the partitionIndex.
	
	static void swap(int[] arr, int i, int pIndex) {
		int temp = arr[i];
		arr[i] = arr[pIndex];
		arr[pIndex] = temp;
	}
	
	static int partition(int[] arr, int start, int end) {
		
		int pivot = arr[end];
		//pIndex = partitionIndex
		int pIndex = start;
		for(int i=start;i<end;i++) {
			if(arr[i] <= pivot) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		//finally swap pivot with the pIndex;
		swap(arr, pIndex, end);
		return pIndex;
	}
	
	static void quicksort(int[] arr, int start, int end) {
		
		if(start<end) {
			
			//we'll choose pivot and partition the array
			int pIndex = partition(arr, start, end);
			
			quicksort(arr, start, pIndex-1);
			quicksort(arr, pIndex+1, end);

		}
	}
	
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		quicksort(arr, 0, arr.length-1);
		SelectionSort.printArray(arr, 0);
		s.close();
	}
	

}
