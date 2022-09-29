package Algoritmos;

public class ejercicio_6 {

    public static void main(String[] args) {

        bySelectionSort();

    }


    public static void bySelectionSort() {

        int array[] = {2, 7, 1, 4, 3, 5, 0, 8, 2, -1, -2};
        int tempPosition = 0;
        int minPosition= 0;


        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }


            for (int i = 0; i < array.length ; i++) {

                minPosition = i;

                for (int j = i + 1;j < array.length;j++) {
                    if (array[minPosition] > array[j]) minPosition = j;

                }
                    tempPosition = array[i];
                    array[i] = array[minPosition];
                    array[minPosition] = tempPosition;

                System.out.println(" ");
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[j] + " ");
                }
            }

            System.out.println(" ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }



    }



