public class functions{
    public static void main(String[] args){
        // double result = calculateInterest(.1,10000,2);
        // System.out.println(result);

        // array of InterestHistory
        double[] history = InterestHistory(10000,.15,5);
        for(int i=0; i<history.length;i++){
            System.out.println(i+" - "+history[i]);
        }
    }

    static double calculateInterest(double interest, double principal, double years){
        return interest*principal*years;
    }

    static double[] InterestHistory(double amt, double interest,int years){
        double[] acc = new double[years];
        for(int i = 0; i < acc.length; i++){
            int y= i+1;
            acc[i] = calculateInterest(interest,amt,y);

        }
        return acc;

    }
}