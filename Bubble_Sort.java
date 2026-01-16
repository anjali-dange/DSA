package dsa;
public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 2, 1, 7};
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {
            boolean isswap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isswap = true;
                }
            }
            if (!isswap) {
                break;
            }
        }
        System.out.println("The sorted array is:");
        for (int s = 0; s < n; s++) {
            System.out.print(arr[s] + " ");
        }
    }
}
