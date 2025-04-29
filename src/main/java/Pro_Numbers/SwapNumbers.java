package Pro_Numbers;

//public class SwapNumbers {
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 10;
//
//        System.out.println("Before swap: a = " + a + ", b = " + b);
//
//        // Swapping
//        int temp = a;
//        a = b;
//        b = temp;
//
//        System.out.println("After swap: a = " + a + ", b = " + b);
//    }
//}

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        // Swapping without temp
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
