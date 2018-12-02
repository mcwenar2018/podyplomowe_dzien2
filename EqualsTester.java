public class EqualsTester {
    public static void main(String[] args) {
/*  // ZADANIE 1
        String str1, str2;

        str1 = "raz dwa trzy";
        str2 = "raz dwa trzy";

        System.out.println("str1: " + str1);
        System.out.println("str2: " +str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2)); // ten sam obiekt, kompilatur optymalizuje i str1 str2 to ten sam obiekt
*/

/*  // ZADANIE 2

        String str1, str2;

        str1 = "raz dwa trzy";
        str2 = new String("raz dwa trzy"); // wymuszenie nowego obiektu za pomoca new

        System.out.println("str1: " + str1);
        System.out.println("str2: " +str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));
        System.out.println("Ta sama zawartosc? " + (str1.equals(str2))); // metoda equals sprawdza czy obiekty sa identyczne
*/

// ZADANIE 3

        String name = "Tomek";

        System.out.println(name.getClass());
        System.out.println(name.getClass().getName()); // sprawdza jaka to klasa i jak sie nazywa

        System.out.println();

        System.out.println(name instanceof String);  // czy name jest instancja klasy string
        System.out.println(name instanceof  Object); // czy name jest instancja klasy object

        Object object = new Object();
        object = name;
        System.out.println(object instanceof  Integer); // czy name (jako object) jest instancja klasy Integer



    }

}
