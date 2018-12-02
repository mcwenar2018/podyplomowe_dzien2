public class Petle {
    public static void main(String[] args) {

        //FOR
        for(int i=1; i<11;i++){
            System.out.println("Wyswietlam i: " + i);
        }

        //WHILE
        boolean isOK = false;

        do {
            System.out.println("Jest OK");
        } while (isOK);
        System.out.println("Nie jest dobrze");


        // ENHANCED FOR
        int[] arr = {2, 3, 4, 5, 6, 7, 11, 22, 33};

        for (int i: arr) {
            System.out.println(i);
        }

        //przerywanie petli

        // continue

        int [] arr1 = {3, 6, 6, 3, 6};
        for (int a = 0; a < arr.length; a++) {
            if (arr1[a] == 3){
                continue;
            }
            System.out.println((a+ ": "+ arr1[a]));

        }

    }
}
