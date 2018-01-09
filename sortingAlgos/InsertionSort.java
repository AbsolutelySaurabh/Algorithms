/**
 * 
 */
package sortingAlgos;
import java.util.*;
public class InsertionSort {
	
	//The logic is simple,
	//Initially we'll let i go from 1st index to n
	//Then for all the elements  to the left of the ith index, we'll swap the elements with the i if > arr[i], 
	//means we'll shift all the elements to the left of arr[i] to the right which are greater than arr[i];
	
	private static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			
			//We'll need to use an index k, num as after swapping the values will be changed, so we need to keep track of the arr[i]
			int num = arr[i], k=i;
			for(int j=i-1;j>=0;j--){
				if(arr[j]>num){
					int temp = arr[k];
					arr[k]=arr[j];
					arr[j]=temp;
					//as arr[i] has been shifted to the left
					k--;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		
		insertionSort(arr);
		SelectionSort.printArray(arr, 0);
		s.close();
	}

}
