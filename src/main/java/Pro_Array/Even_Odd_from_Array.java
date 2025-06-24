package Pro_Array;

public class Even_Odd_from_Array {
    public static void main(String[] args) {
        int [] num1 = {10, 21, 34, 19, 7};

        System.out.print("Even Numbers in Array.Array : ");
        for( int i = 0; i < num1.length; i++) {
            if ( num1[i] % 2 == 0){
                System.out.print ( num1[i] + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers in Array.Array : ");
        for( int i = 0; i < num1.length; i++) {
            if ( num1[i] % 2 != 0){
                System.out.print( num1[i] + " ");
            }
        }

    }
}
