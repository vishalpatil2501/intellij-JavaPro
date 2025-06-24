package Pro_Array;

public class RepetativeEleMoveToLast {

    static void moveRepeatsToEnd(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] appeared before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If duplicate found, shift current element to end
            if (isDuplicate) {
                for (int k = i; k < n - 1; k++) {
                    // Swap arr[k] and arr[k+1] without temp variable
                    arr[k] = arr[k] + arr[k + 1];
                    arr[k + 1] = arr[k] - arr[k + 1];
                    arr[k] = arr[k] - arr[k + 1];
                }
                i--; // Recheck the new element now at i
                n--; // Last element is fixed now, reduce effective size
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 3};
        moveRepeatsToEnd(arr);

        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


