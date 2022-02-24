import java.util.Scanner;

// store utf-16 format
// String is immutable, reassign it to new string.
// holds the reference to that location.
public class Strings {
    public static void main(String[] args){
        //  how to take input 
        // Scanner scanner = new Scanner(System.in);
        // String message  = scanner.nextLine();
        // scanner.close();

        String message = "hello world";
        message = message +"!";
        System.out.println(message);
        String message2 = message;
        if (message == message2) {System.out.println("string equal, using ref");}
        if (message.equals(message2)) {System.out.println("string equal char by char");
    }

    String sval = String.valueOf(124);
    System.out.println(sval);
    // StringBuilder can make string muteable

    
    StringBuilder sb = new StringBuilder(128);
    sb.append("Im powerful ");
    sb.append("pankaj");
    sb.insert(sb.indexOf("power"),"the");
    System.out.println(sb.toString());

    // messge.intern() method can be used to reference the same string.
         
    //  format specifiers
    String s2 = String.format("i have invested %d in mf and %d in stock",10000,100);
    System.out.println(s2);
    }
}
