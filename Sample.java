public class Sample {
    public static void main(String[] args) {
/*
        byte a = 7;
        short b;
        int c;

        c = a;
        b = (short)c // niewskazane rzutowanie

        int a = 5;
        double b = 13,5;
        int c = (int)b/a; // utrata precyzji
*/

/*
        Employee emp = new Employee();
        VicePresident vp = new VicePresident();

        emp = vp; // OK, bo to co ma Employee ma tez VicePresident - konwersja niejawna
        vp = (VicePresident)emp; // rzutowanie na sile

*/

        Float f1 = 12.5F;
        Float f2 = 2.2F;
        Math.min(f1,f1);  //boxing unboxing

        {
            int a = 5;
        }
        System.out.println();
    }

}

class Employee {}
class VicePresident extends Employee {}