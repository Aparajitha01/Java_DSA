import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Random rand = new Random();
		int a[] = new int[10];
		for(int i=0;i<10;i++){
		    a[i]=rand.nextInt(100);
		}
		System.out.print("Before:");
	    for(int i=0;i<10;i++){
	    System.out.print(a[i]+" ");
		}
		System.out.println();
		
		insertionSort(a);
		System.out.print("After:");
		for(int i=0;i<10;i++){
	    System.out.print(a[i]+" ");
		}
			
	}
	
	public static void insertionSort(int a[]){
	    for(int i=1;i<a.length;i++){
	        int current = a[i];
	        int j=i-1;
	        while(j>=0 && a[j]>current){
	            a[j+1]=a[j];
	            j--;
	        }
	        a[j+1]=current;
	    }
	}
}
