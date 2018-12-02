public class InstanceCounter {
    public static void main(String[] args) {

        new A();
        new A();
        new A();
        new A();
        new A();
        new A();
        System.out.println(A.counter);

    }
}

    class A {
        static int counter;

        public A() { // KONSTRUKTOR
            counter++;
        }
    }
