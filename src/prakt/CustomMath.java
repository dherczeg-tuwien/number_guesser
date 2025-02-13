package prakt;

public class CustomMath {

    public static double dividesAB(int a, int b) {
        if (b==0 ){
            return Double.NaN;
        }

        return a/b;
    }

}
