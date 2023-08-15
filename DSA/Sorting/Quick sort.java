import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=rand.nextInt(100);
		}
		System.out.print("Before: ");
		printArray(a);
		
		QuickSorting(a,0,a.length-1);
		
		System.out.print("\nAfter: ");
		printArray(a);

	}
	
    private static void printArray(int arr[]) {
    	for(int i=0;i<10;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
    
    public static void QuickSorting(int a[],int LowIndex,int HighIndex) {
    	if(LowIndex >= HighIndex) {
    		return;
    	}
    	//int pivot = a[HighIndex];
    	
  	//To choose pivot randomly.....................
  	    int pivotIndex = new Random().nextInt(HighIndex-LowIndex)+LowIndex;
    	int pivot = a[pivotIndex];
    	swap(a,pivotIndex,HighIndex);
    
    	int left = partition(a, LowIndex, HighIndex, pivot);
    	QuickSorting(a,0,left-1);
    	QuickSorting(a,left+1,HighIndex);
    	
    	
    }

	private static int partition(int[] a, int LowIndex, int HighIndex, int pivot) {
		int left=LowIndex;
    	int right=HighIndex;
    	
    	while(left<right) {
    		while(a[left]<=pivot && left<right) {
    		left++;
    		}
    	
            while(a[right]>=pivot && left<right) {
    		right--;
    		}
            
            swap(a,left,right);
    	}
    	swap(a, left,HighIndex);
		return left;
	}
    private static void swap(int a[],int left,int right) {
    	int temp = a[left];
    	a[left]=a[right];
    	a[right]=temp;
    	
    }
    

}
