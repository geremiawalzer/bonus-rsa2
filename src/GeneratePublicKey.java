import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GeneratePublicKey {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a prime number for e:");
        if (scanner.nextBigInteger().isProbablePrime(4)){
            Variables.setE(scanner.nextLong());
        }

        Variables.setE(Algorithm.extendedEuclidianAlgorithm(Variables.getP(), Variables.getQ(), Variables.getE()));

        PrintWriter privateKey = new PrintWriter(new FileWriter("resources/sk.txt"));
        privateKey.println("("+(float)Variables.getN()+","+(float)Variables.getD());
        privateKey.close();

        PrintWriter publicKey = new PrintWriter(new FileWriter("resources/pk.txt"));
        publicKey.println("("+(float)Variables.getN()+","+(float)Variables.getE());
        publicKey.close();
    }
}
