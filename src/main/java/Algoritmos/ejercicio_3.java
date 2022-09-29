package Algoritmos;

public class ejercicio_3 {

    public static void main(String[] args) {

        System.out.print(" = " + divideNumber(10, 2));

    }


    public static int divideNumber(int number_1, int number_2) {

        int value = 0;

        System.out.print("la division de " + number_1 + "/" + number_2);

        while (number_1 >= number_2) {
            value++;
            number_1 -= number_2;

        }

        return value;
    }

}
