package w3Schools;
// import w3Schools.Test;

public class Main {
    int defaultValue;

    public Main(int input_value) {
        defaultValue = input_value;
    }

    public Main() {
        defaultValue = 100;
    }

    void show(String[] args){
        for(String s : args){
            System.out.println(s);
        }
    }

    //  recursion program
    public static void fibonacci(int a,int b) {
        System.out.print(a+" ");
        if(a < 100 )
        fibonacci(b,a+b);
    }

    public static void main(String[] args) {
        // String s = "My name is pankaj";
        // String[] data = {"pankaj","pundir"};
        
        // Test t1 = new Test();
        // t1.print_dummy();

        // fibonacci(1,1);

        // Main obj = new Main();
        // obj.show(data);
        // System.out.println(obj.defaultValue);

        Person p = new Person();
        p.setName("Rajesh");
        System.out.println(p.getName());
    }

    
}
