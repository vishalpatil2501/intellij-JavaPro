package Pro_Array;

import java.util.Arrays;

public class Compare_Two_array {
    public static void main(String[] args) {

        int a [] = { 1,2,3,4,5,4};
        int b [] = { 1,2,3,4,5};

        boolean status = Arrays.equals(a,b);

        if (status == true){
            System.out.println("Arrays are Equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}
