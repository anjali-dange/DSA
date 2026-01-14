//binary search
package dsa;
public class Binary_Search {
public static void main(String[] args) {
	int arr[]= {22,3,4,5,6,7,8,9,10,12,14,16,17,18};
	int key=17;
	int start=0;
	int end=arr.length-1;
	boolean found=false;
	while(start<=end) {
		int mid=(start+end)/2;
		if(arr[mid]==key) {
			 System.out.println("Element found at index: " + mid);
			  found = true;
              break;
		}
		else if(key<arr[mid]) {
			end=mid-1;
		}
		else {
			start=mid+1;
		}
	}
	if(!found) {
		System.out.println("element not found");
	}
}
}