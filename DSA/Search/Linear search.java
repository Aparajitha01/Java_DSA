import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=rand.nextInt(100);
		}
		printArray(a);
		int x = sc.nextInt();
		int ans = Search(a,x);
		if(ans == -1) {
			System.out.println("Element is not present in  the array");
		}
		else {
			System.out.println("Element found at position : "+ans);
		}

	}
	   private static void printArray(int arr[]) {
	    	for(int i=0;i<10;i++) {
	    		System.out.print(arr[i]+" ");
	    	}
	    }
	public static int  Search(int a[],int num) {
		for(int i=0;i<a.length;i++) {
			if(a[i]== num) {
				return i;
			}
		}
		return -1;
	}

}
