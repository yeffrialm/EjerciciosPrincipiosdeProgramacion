package Algoritmos;

public class ejercicio_5 {

    public static void main(String[] args) {

        byBlubbleSort();

    }


    public static void byBlubbleSort() {
        int array[] = {2, 7, 1, 4, 3, 5, 0, 8, 2, -1, -2};
        int tempPosition = 0;
        int rounds = 0;
        boolean order = false;


        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }

        while (!order) {

            order = true;
            for (int i = 0; i < array.length - 1 - rounds; i++) {
                if (array[i] > array[i + 1]) {

                    tempPosition = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tempPosition;

                    order = false;

                }
            }
            rounds++;
            System.out.println(" ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println(" ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


}
