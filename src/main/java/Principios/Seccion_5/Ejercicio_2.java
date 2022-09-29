package Principios.Seccion_5;

public class Ejercicio_2 {


    public static void main(String[] args) {

        System.out.println(reproducirEjercicio("musculo"));
        series("Piernas", 12);

    }

    static String reproducirEjercicio(String nombreEjercicio) {

        return "se esta reproduciendo el ejercicio: " + nombreEjercicio;

    }


    public static void series(String nombreEjercicio, int numeroMovimientos) {
        int segundosDescanso = 0;
        for (int i = 0; i < numeroMovimientos; i++) {
            reproducirEjercicio(nombreEjercicio);
            System.out.println(nombreEjercicio + " serie: " + i);
        }

    }

}




