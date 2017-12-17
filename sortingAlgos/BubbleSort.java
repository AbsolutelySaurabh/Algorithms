package sortingAlgos;
import java.util.*;
public class BubbleSort {
	
	private static void bubbleSort(ArrayList<Integer> arr){		
		for(int i=0;i<arr.size()/2;i++){
			for(int j=0;j<arr.size()-1 ;j++){
				
				if(arr.get(j)>arr.get(j+1)){
					int temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
	}
	
	private static void printOutput(ArrayList<Integer> arr, int index){
		if(index == arr.size()){
			return;
		}
		System.out.println(arr.get(index));
		printOutput(arr, ++index);
	}
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList();
		int input = s.nextInt();
		while(input!=-1){
			arr.add(input);
			input = s.nextInt();
		}
		
		bubbleSort(arr);
		printOutput(arr, 0);
		s.close();		
	}
}
