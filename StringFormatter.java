import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {

        int accountBalance = 15_005;
        System.out.printf("Saldo : %,d zl %n", accountBalance);

        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("%.3f%n", pi);
        System.out.printf(new Locale("us"),"%.3f%n", pi );
    }

}
