public class DayCounter {

    public static void main(String[] args) {
        int year = 2018;
        int month = 1;
 /*           if (args.length>0){    // caly ten blok powoduje przypisanie argumentow z konsoli do zmiennych
                month = Integer.parseInt(args[0]);   // parsowanie stringa do INT metoda klasy Intiger
                }
                if (args.length>1){
                year = Integer.parseInt(args[1]);
                }
*/
        for (month = 1; month <= 12 ; month++) {
            for (int day = 1; day < countDays(month, year); day++) {
                System.out.println(day + "/" + month + "/" + year);
            }
            System.out.println(month + "/" + year + " ma " + countDays(month, year) + " dni.");
        }
        }





   public static int countDays(int month, int year){
        int count = -1;

        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                count = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                count = 30;
                break;
            case 2:
                if (year%4 == 0) {
                    count = 29;
                } else {
                    count = 28;
                }
                if ((year % 100 == 0) && (year % 400 != 0)){
                    count = 28;
                }
        }

        return count;
    }
}
