package dataStructure;

public class BubbleSort {
	private int[] theArray;
	private int arraySize;
	private int itemsInArray =0;
	static long startTime;
	static long endTime;
	public static void main(String[] args) {
		BubbleSort num = new BubbleSort(10000);
		num.generateRandomArray();
		num.sort();
	}
	BubbleSort(int size){
		arraySize =size;
		theArray = new int[size];
	}
	public void sort() {
		startTime = System.currentTimeMillis();
		for(int i=0;i<theArray.length-1;i++) {
			for(int j=0;j<theArray.length-i-1;j++) {
				if(theArray[j+1]<theArray[j]) {
					swap(j+1,j);
				}
			}
		}
		System.out.println("Sorted array");
		System.out.println(" ");
		for(int t:theArray) {
			System.out.print(t+ " ");
		}	
		endTime =System.currentTimeMillis();
		System.out.println("Time taken "+ (endTime -startTime));
	}
	public void swap(int a, int b) {
		int temp= theArray[a];
		theArray[a] = theArray[b];
		theArray[b] = temp;
	}
	public void generateRandomArray() {
		for(int i=0; i<arraySize; i++) {
			theArray[i]= (int)(Math.random()*10);
		}
		for(int t:theArray) {
			System.out.print(t+" ");
		}	
		System.out.println(" ");

	}

}
