package w3Schools;

public class ThreadsClass extends Thread{
    int numbers = 0;
    static int LIMIT = 10;
    public static void main(String[] args) {
        ThreadsClass tc = new ThreadsClass();
        tc.start();
        while(tc.isAlive()){System.out.println("Waiting");}
        for (int i = 0; i <LIMIT;i++){
            System.out.println("within main "+tc.numbers++);
        }

    }

    public void run() {
        for (int i = 0; i <LIMIT;i++){
            System.out.println("within a thread "+numbers++);
        }
    }

}
