import java.math.BigInteger;
import java.security.SecureRandom;

public class Variables {
    static final SecureRandom random = new SecureRandom();
    static long p = BigInteger.probablePrime(4, random).longValue();
    static long q = BigInteger.probablePrime(4, random).longValue();
    static long n = p*q;
    static long e;
    static long d;

    public static long getP() {
        return p;
    }
    public static long getQ() {
        return q;
    }
    public static long getN() {
        return n;
    }
    public static long getE() {
        return e;
    }
    public static long getD() {
        return d;
    }

    public static void setP(long number){p = number;}
    public static void setQ(long number){q = number;}
    public static void setN(long number){n = number;}
    public static void setE(long number){e = number;}
    public static void setD(long number){d = number;}
}
