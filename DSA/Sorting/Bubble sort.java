import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Random rand = new Random();
		int a[]=new int[10];
		for(int i=0;i<10;i++) {
			a[i]=rand.nextInt(100);
		}
		printArray(a);
		boolean SwappingRequired =true;
		while(SwappingRequired) {
			SwappingRequired=false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				SwappingRequired=true;
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
		System.out.println("After");
       printArray(a);
	}
	
	private static void printArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
