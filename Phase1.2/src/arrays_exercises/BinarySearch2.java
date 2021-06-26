package arrays_exercises;

public class BinarySearch2 {
	public static void main(String args[]) {
	int ar[]= {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};//must be sorted first! (in this case, its already pre-sorted)
	int key = 23;
	int arrlength = (ar.length-1);
	binarySearch(ar,0,key,arrlength);
	}

public static void binarySearch(int[] ar, int start, int key, int length) {
	int midValue = (start+length)/2;
	while(start<=length) {
		if(ar[midValue]<key) {
			start = midValue + 1;
		} else if(ar[midValue] == key) {
			System.out.println("Element is found at index: " + midValue);
			break;
		} else {
			length = midValue - 1;
		}
		midValue = (start+ length)/2;
		}
	if(start > length) {
		System.out.println("Element is not found");
	}
}
	
}
