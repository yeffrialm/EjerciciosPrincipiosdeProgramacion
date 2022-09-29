package Principios.Seccion_3;

public class Ejercicio_10 {

    public static void main(String[] args) {

        String[][] Peliculas = {{"Sicario", "Los Cinco", "Linea de Meta", "La Adopciom", "La Final", "Sonata Violonchelo", "Letras Explicitas"}, {"250", "250", "250", "200", "200", "200", "200"}, {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"}};

        for (int i = 0; i < Peliculas.length; i++) {
            for (int j = 0; j < 7; j++)
                System.out.println(Peliculas[i][j] + " ");

        }

    }

}
