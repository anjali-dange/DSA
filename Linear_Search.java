//linear search
package dsa;
public class Linear_Search {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	int key=5;
	boolean found=false;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			  System.out.println("Element found at index: " + i);
			  found=true;
			  break;
		}
	}
	if(!found) {
		System.out.println("element doesnot found");
	}
}
}
