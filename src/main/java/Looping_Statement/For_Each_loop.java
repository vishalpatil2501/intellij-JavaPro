package Looping_Statement;

public class For_Each_loop {
    public static void main(String[] args) {

        String [] fruits = { "Apple", "Banana", "Grapes"};

//        for( int i = 0; i< fruits.length; i++){
//            System.out.println(i + ": " + fruits[i]);
//        }

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
