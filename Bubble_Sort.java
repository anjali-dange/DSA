package dsa;
public class Bubble_Sort{
	static void bubble_sort(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-i;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
	public static void main(String[] args) {
		int arr[]= {5,3,8,4,2};
		System.out.println("after swapping");
		bubble_sort(arr);
		for(int x:arr) {
			System.out.println(x+"  ");
		}
	}
}
