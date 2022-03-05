package w3Schools;

public class Test {
      void print_dummy() {
        System.out.println( "printing a random number " + getRandomNumber() );
    }

    int getRandomNumber() {
        return (int) (Math.random()*100);
    }

    
}
