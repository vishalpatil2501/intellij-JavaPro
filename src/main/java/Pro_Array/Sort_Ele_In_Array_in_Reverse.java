package Pro_Array;

import java.util.Arrays;

public class Sort_Ele_In_Array_in_Reverse {
    public static void main(String[] args) {

        int [] num = { 10, 90, 40, 4, 80, 1};

        Arrays.sort(num);
        System.out.println("Sorted array (Ascending): " + Arrays.toString(num));

        System.out.print("Array.Array in Reverse order: ");

        for(int i = num.length-1; i>=0; i--){
            System.out.print(num[i] +" ");
        }
    }
}
