public class cmd_args {
    public static void main(String[] args){
        if(args.length < 1) System.out.println("no cmd arguments");
        else for(String arg : args) System.out.println(arg);
        //  adding inverted qouted make the arguement combined
        double d = Double.parseDouble("3534.46");
        System.out.println(d);
    }
}
