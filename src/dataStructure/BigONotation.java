package dataStructure;

public class BigONotation {
	private int[] theArray;
	private int arraySize;
	private int itemsInArray =0;
	static long startTime;
	static long endTime;
	public static void main(String[] args) {
		BigONotation algo = new BigONotation(10000);
		algo.generateRandomArray();
		algo.linearSearchForValue(3);
		BigONotation algo2 = new BigONotation(20000);
		algo2.generateRandomArray();
		algo2.linearSearchForValue(5);
		BigONotation algo3 = new BigONotation(200000);
		algo3.generateRandomArray();
		algo3.linearSearchForValue(5);
	}
	BigONotation(int size){
		arraySize =size;
		theArray = new int[size];
	}
	// O(1)
	public void addItemToArrya(int newItem) {
		theArray[itemsInArray++]= newItem;

	}
	//o(N)
	public void linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexWithValue ="";
		startTime = System.currentTimeMillis();
		for(int i=0; i<arraySize ;i++) {
			if(theArray[i] == value) {
				valueInArray =true;
				indexWithValue += i + " ";
			}

		}
		endTime= System.currentTimeMillis();
		System.out.println("Time"+ (endTime - startTime));
	}
	public void generateRandomArray() {
		for(int i=0; i<arraySize; i++) {
			theArray[i]= (int)(Math.random()*10);
		}
	}
}
