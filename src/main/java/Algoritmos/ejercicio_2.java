package Algoritmos;

public class ejercicio_2 {

    public static void main(String[] args) {

        System.out.print(" = " + multiplyNumber(4,2));

    }


    public static int multiplyNumber(int number_1, int number_2) {

        int value = 0;

        System.out.print("la multiplicacion de " + number_1 + "*" + number_2);

        while (number_1 > 0) {
            number_1--;
            value += number_2;

        }

        return value;
    }

}
