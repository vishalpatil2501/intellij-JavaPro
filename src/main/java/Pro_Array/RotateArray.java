package Pro_Array;

public class RotateArray {

    static void rotateRightByOne (int[]arr){
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i] + arr[i-1];
            arr[i-1] = arr[i] - arr[i-1];
            arr[i] = arr[i] - arr[i-1];
        }
    }

    static void rotateRightByOne (char[] arr){
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] ^= arr[i - 1];
            arr[i - 1] ^= arr[i];
            arr[i] ^= arr[i - 1];
        }
    }
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        char[] charArr = {'A', 'B', 'C', 'D'};

        rotateRightByOne(intArr);
        rotateRightByOne(charArr);

        for (int num : intArr) {
            System.out.print(num + " "); // Output: 5 1 2 3 4
        }
        System.out.println();
        for (char ch : charArr) {
            System.out.print(ch + " "); // Output: D A B C
        }
    }
}
