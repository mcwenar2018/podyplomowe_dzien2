public class SampleInstrukcje {
    public static void main(String[] args) {

        int a = 3;

        if (a< 0)
         {
            System.out.println("a mniejsze od zera");
        }
         else if (a > 0) {
            System.out.println("a wieksze od zera");
        } else {
            System.out.println("a rowne zero");
        }

    // SWITCH

        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("dobrze");
                break;
            case 'C':
                System.out.println("Moglo byc lepiej");
                break;

            default:
                System.out.println("Rozwaz oszukiwanie");
                break;
        }

// KROTKI IF ? :

        int x =2;
        System.out.println((x>5) ?" wieksze" : "mniejsze");


    }
}

