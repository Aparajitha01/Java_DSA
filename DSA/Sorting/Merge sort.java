import java.util.*;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=rand.nextInt(10);
		}
		System.out.print("Before: ");
		printArray(a);
		
		MergeSorting(a);
		
		System.out.print("\nAfter: ");
		printArray(a);

	}
	
    private static void printArray(int arr[]) {
    	for(int i=0;i<10;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
    
   private static void MergeSorting(int a[]){
    	int ArrayLength = a.length;
    	int midLength = ArrayLength/2;
    	if(ArrayLength<2) {
    		return;
    	}
    
    	int left[]= new int[midLength];
    	int right[]=new int[ArrayLength-midLength];
    	
    	for(int i=0;i<midLength;i++){
    		left[i]=a[i];
    	}
    	for(int i=midLength;i<ArrayLength;i++){
    		right[i-midLength]=a[i];
    	}
    	
    	MergeSorting(left);
    	MergeSorting(right);
    	
    	Merge(a,left,right);
    }
   private static void Merge(int a[],int right[],int left[]) {
    	 int leftSize = left.length;
    	 int rightSize = right.length;
    	 
    	 int i=0,j=0,k=0;
    	 
    	 while(i<leftSize && j<rightSize) {
    		 if(left[i]<=right[j]) {
    			 a[k]=left[i];
    			 i++;
    		 }
    		 else {
    			 a[k]=right[j];
    			 j++;
    		 }
    		 k++;
    	 }
    	 while(i<leftSize) {
    		 a[k]=left[i];
    		 i++;
    		 k++;
    	 }
    	 while(j<rightSize) {
    		 a[k]=right[j];
    		 j++;
    		 k++;
    	 }
    }
    

}
