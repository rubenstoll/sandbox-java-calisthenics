package ch.toto.toolbox.datastructures.arrays;

/**
 * Created by ruben
 **/
class ArrayUtils {
    public int getSize(int[] arr) {
        // code here
//        arr.length();

        if(arr.length > 10) {
            System.out.println("INVALID SIZE Array size is greater than 10");
            return -1;
        }
        return arr.length;
    }
}