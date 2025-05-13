package Pro_Array;

public class Compare_Two_Arrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        boolean areEqual = true;

        if (arr1.length != arr2.length) {
            areEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++){
                if (arr1[i] != arr2[i]){
                    areEqual = false;
                    break;
                }
            }
        }
        if (areEqual){
            System.out.println("Arrays are Equal ");
        } else {
            System.out.println("Arrays are not Equal");
        }
    }
}
