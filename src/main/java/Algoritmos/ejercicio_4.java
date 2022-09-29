package Algoritmos;

public class ejercicio_4 {

    public static void main(String[] args) {

        primeNumber(13);

    }


    public static void primeNumber(int number) {

        boolean prime = true;

        System.out.print("el numero " + number);

        for (int i = 2; i <= number / 2 && prime; i++) {

            if (number % i == 0) prime = false;

        }

        if (prime) System.out.print(": es un numero primo");
        else System.out.print(": no es un numero primo");

    }

}
