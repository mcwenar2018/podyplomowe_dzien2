public class Lab3_2_3 {
    public static void main(String[] args) {
        class Bicycle {

            private int instanceCounter = 0;

            //instance variables
            public int gear, speed, seatHeight;
            public String color;

            //constructor
            public Bicycle(int gear, int speed, int seatHeight, String color) {
                gear = 0;
                speed = 0;
                seatHeight = 0;
                color = "Unknown";
                instanceCounter++;
            }

            public int countInstances() {
                return instanceCounter;
            }

        }
    }
}