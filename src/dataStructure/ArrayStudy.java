package dataStructure;

public class ArrayStudy {
	private int arraySize;
	private int width, length;
	private int [] theArray;
	private int[][] theOtherArray;

	public static void main(String [] args) {
				ArrayStudy arr = new ArrayStudy(40);
				arr.onedimArray();
				arr.printArray();
		ArrayStudy arr2 = new ArrayStudy(10,12);
		arr2.multidimArray();
		arr2.print2dimArray();
	}
	ArrayStudy(int size){
		arraySize = size;
		theArray = new int[arraySize];
	}
	ArrayStudy(int width, int length) {
		this.width= width;
		this.length=length;
		theOtherArray= new int[length][width];
	}
	public void onedimArray() {
		for (int i=0;i<arraySize;i++) {
			theArray[i]= (int)(Math.random()*10);
		}
	}
	public void printArray() {
		for(int i:theArray) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	public void multidimArray() {
		
		for(int i =0;i<length;i++) {
			for( int j=0;j<width;j++) {
				theOtherArray[i][j]= (int)(Math.random()*10);
			}
		}	
	}
	public void print2dimArray() {
		for(int i=0;i<length;i++) {
			System.out.println();
			for(int j=0;j<width;j++) {
				System.out.print(theOtherArray[i][j]+" ");
			}
		}
	}
}
