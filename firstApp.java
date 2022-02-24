public class firstApp{
    public static void main(String[] args){
        float ff = 7.0f/2.0f;
        double d = 434d;
        long l = 7l/2l;
        int inc = 1;

        //  Array sum
        float[] theVals = new float[3];
        theVals[0] = 23.5f;theVals[1] =2;theVals[2]=1;
        float sum = 0f;
        // for(int i=0;i<theVals.length;i++){
        //     sum+=theVals[i];
        // }

        for(float i:theVals){
            sum+=i;
        }
        System.out.println("summation: " + sum);
        // array sum ends

        // do{

        //     System.out.println(++inc);
        // }while(inc<5);

           

        System.out.println( ff );System.out.println( l);
        System.out.println("my first line"); 
        // this is the comment
    }
}