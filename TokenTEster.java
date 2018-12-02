import java.util.StringTokenizer;

public class TokenTEster {

    public static void main(String[] args) {
        StringTokenizer st1, st2; //deklaracja zmiennych

        String quote1 = "GOOG 530,80 -9,98"; // GOOG   530,80   -9,98
        st1 = new StringTokenizer(quote1);

        System.out.println("Token 1: " + st1.nextToken());
        System.out.println("Token 2: " + st1.nextToken());
        System.out.println("Token 3: " + st1.nextToken());

        String quote2 = "RHT@75,00@0,22";
        st2 = new StringTokenizer(quote2, "@"); // delimiter @ jako drugi parametr

        System.out.println("Token 1: " + st2.nextToken());
        System.out.println("Token 2: " + st2.nextToken());
        System.out.println("Token 3: " + st2.nextToken());


    }

}
