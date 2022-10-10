package Coding_Problemset;

import java.util.Scanner;

public class RadixSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int b = sc.nextInt();
	     int[] a = new int[b];
	     for(int i = 0;i<a.length;i++) {
	     	a[i] = sc.nextInt();
	     }
	     int n = a.length;
	     RadixSort rs = new RadixSort();
	     rs.radixsort(a,n);
	     rs.printArray(a, n);
	     
	}
	
	void radixsort(int a[], int n) {    
		  int max = getMax(a, n);  
		  for (int place = 1; max / place > 0; place *= 10)  
		    countingSort(a, n, place);  
		}

	int getMax(int[] a, int n) {  
		  int max = a[0];  
		  for(int i = 1; i<n; i++) {  
		      if(a[i] > max)  
		         max = a[i];  
		  }  
		  return max; 
		}  
	
	
	void countingSort(int a[], int n, int place)    
	{  
	   int[] output = new int[n+1];  
	   int[] count = new int[10];  
	  
	 
	  for (int i = 0; i < n; i++)  
	    count[(a[i] / place) % 10]++;  
	        
	   
	  for (int i = 1; i < 10; i++)  
	    count[i] += count[i - 1];  
	   
	  for (int i = n - 1; i >= 0; i--) {  
	    output[count[(a[i] / place) % 10] - 1] = a[i];  
	    count[(a[i] / place) % 10]--;  
	  }  
	  
	  for (int i = 0; i < n; i++)  
	    a[i] = output[i];  
	} 
	
	void printArray(int a[], int n)  
	{   
	    for (int i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
}
