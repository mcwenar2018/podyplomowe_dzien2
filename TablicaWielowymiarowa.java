public class TablicaWielowymiarowa {
    public static void main(String[] args) {

        int[][][] array = {{{1}, {1,2,3},{1,2},{2}}};


        for (int x = 0; x < array.length ; x++) {
            for (int y = 0; y < array[x].length ; y++)
                for (int z = 0; z < array[x][y].length; z++) {

                    System.out.print("[" + x + "]"+ "[" + y + "]" + "[" + z + "] ");
                    System.out.print(array[x][y][z]);
                    System.out.println(" ");
                }
        }
    }
}
