package Pro_Array;

public class Sum_ele_array {
    public static void main(String[] args) {

        int [] num = {1,4,3,7,9};
        int sum = 0;

        for (int i = 0; i < num.length; i++){
            sum = sum + num[i];
        }

//         for (int sum1 : num){
//             sum = sum + sum1;
//         }
        System.out.println( "SUm of Array.Array : " + sum);
    }
}
