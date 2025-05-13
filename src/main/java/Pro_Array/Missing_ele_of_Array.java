package Pro_Array;

public class Missing_ele_of_Array {
    public static void main(String[] args) {

        int a[] = {5, 6, 7, 9, 10};

        int sum1 = 0;

        for(int i = 0; i < a.length; i++){
            sum1 = sum1 + a[i];
        }
        System.out.println( "Sum of Array = " + sum1);

        int sum2 = 0;

        for (int i = 5; i <= 10; i++){
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range of Array = " + sum2);

        System.out.println("Missing element is = " + (sum2 - sum1));
    }
}
