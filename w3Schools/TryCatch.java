package w3Schools;

import java.util.ArrayList;
import java.util.Arrays;

public class TryCatch {
    public static void main(String[] args) {
        int[] array = {1,4,65,7};
        int index = 4;
        // ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(3,43,5));
        try{
            if(index >= array.length) 
            throw new IndexOutOfBoundsException("This is the end of the array");
        System.out.println(array[index]);
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
