import java.math.BigInteger;

public class Algorithm {

    public static long extendedEuclidianAlgorithm(long noP,long noQ, long noE){
        long a = (noP-1)*(noQ-1);
        long b = noE;
        long oldX0 = 1;
        long oldY0 = 0;
        long x0;
        long y0;
        long y1 = 0;
        long x1 = 1;
        long q = a/b;
        long r = a%b;

        while (b != 0){
            a = b;
            b = r;
            x0 = x1;
            y0 = y1;
            x1 = oldX0 - (x1*q);
            y1 = oldY0 - (y1*q);
            q = a/b;
            r = a%b;
            oldX0 = x0;
            oldY0 = y0;
        }

        return b;

    }
}
