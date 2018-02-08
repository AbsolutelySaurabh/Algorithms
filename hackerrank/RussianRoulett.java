package hackerrank;

import java.util.Scanner;

public class RussianRoulett {
	
	public static int min=0, max=0;
	public static int[] a = new int[2];
	
	public static int[] revisedRoulett(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == 1) {
				if(arr[i+1] == 1) {
					arr[i] = 0;
					arr[i+1] = 0;
					min++;
					
					i++;
			
				}else {
					arr[i] = 0;
					min++;
				}
			}
		}
		if(arr[arr.length-1] == 1) {
			min++;
		}
		a[0] = min;
		a[1] = max;
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
			if(arr[i] == 1) {
				max++;
			}
		}
		revisedRoulett(arr);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] +" ");
		}

	}

}
