public class Konwersja3_3_2 {
    public static void main(String[] args) {
        String word = "";
        long result;

        if (args.length > 0) {
            word = args[0];
        }

        switch (word) {
            case "jeden":
                result = 1;
                break;
            case "dwa":
                result = 2;
                break;
            case "trzy":
                result = 3;
                break;
            case "cztery":
                result = 4;
                break;
            case "piec":
                result = 5;
                break;
            case "szesc":
                result = 6;
                break;
            case "siedem":
                result = 7;
                break;
            case "osiem":
                result = 8;
                break;
            case "dziewiec":
                result = 9;
                break;

        }
    }
}