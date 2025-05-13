package Pro_Array;

import java.util.HashSet;

public class DuplicateEleArray {
    public static void main(String[] args) {

        String arr[] = {"Java", "C", "C++", "Java", "Python", "C"};
        boolean flag = false;
        //Approach 1
//
//        for(int i = 0; i< arr.length; i++){
//            for( int j = i+1; j< arr.length; j++){
//                if (arr[i]== arr[j]){
//                    System.out.println("Found Duplicate Element : " + arr[i]);
//                    flag = true;
//                }
//            }
//        }
//        if (flag==false){
//            System.out.println("No Duplicate Element found ");
//        }
//
        //Approach 2
        HashSet <String> langs = new HashSet<>();

        for(String l : arr){
            if (langs.add(l)== false){
                System.out.println("Found Duplicate Element : " + l);
                flag =true;
            }
        }
        if (flag==false){
           System.out.println("No Duplicate Element found ");
        }

    }
}
