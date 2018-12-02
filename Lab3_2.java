import java.util.StringTokenizer;

public class Lab3_2 {
    public static void main(String[] args) {

        // ZADANIE 1
        System.out.println("Zadanie 1");
        StringTokenizer st1;

        String quote1 = "30/08/1988";
        st1 = new StringTokenizer(quote1, "/");

        System.out.println("Dzien: " + st1.nextToken());
        System.out.println("Miesiac: " + st1.nextToken());
        System.out.println("Rok: " + st1.nextToken());

        // Zadanie 2
        System.out.println("Zadanie 2");
        Params par1 = new Params();
        par1.weight = 10;
        par1.height = 20;
        par1.depth = 35;

        Params par2 = new Params();
        par2.weight = 100;
        par2.height = 300;
        par2.depth = 30;

        show(par1, "par1");
        show(par2, "par2");
    }

    static void show(Params parametr){
        System.out.println("Glebokosc: " + parametr.depth);
        System.out.println("Waga: " + parametr.weight);
        System.out.println("Wysokosc:" + parametr.height);
        }

    static void show(Params parametr, String desc){
        System.out.println(desc);
        System.out.println("Glebokosc: " + parametr.depth);
        System.out.println("Waga: " + parametr.weight);
        System.out.println("Wysokosc:" + parametr.height);
    }

}

class Params {
    int height;
    int weight;
    int depth;
}
// ZADANIE 3 na zajeciach !!!!!!!!!!!!!!!!!1
