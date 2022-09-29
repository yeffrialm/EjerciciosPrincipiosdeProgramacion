package Algoritmos;

public class ejercicio_1_refactorizado {

    public static void main(String[] args) {

        System.out.print(" = " + subNumber(5, 1));

    }


    public static int subNumber(int number_1, int number_2) {

        int value = 0;

        System.out.print("la resta de " + number_1 + "-" + number_2);

        while (number_1 > number_2) {
            number_2++;
            value++;

        }

        return value;
    }

}
