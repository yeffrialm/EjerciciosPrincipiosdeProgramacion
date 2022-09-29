package Principios.Seccion_5;

public class Ejercicio_3 {


    public static void main(String[] args) {

        // System.out.println(reproducirArchivo("musculo",14));
        series("Piernas", 12, 0);

    }

    static String reproducirArchivo(String nombreArchivo, int segundosDescanso) {

        String archivoReproducir = "";

        if (segundosDescanso > 0) {

            archivoReproducir = "tomar un descanso de: " + segundosDescanso + " segundos";

        } else

            archivoReproducir = "** Se esta reproduciendo el ejercicio: " + nombreArchivo;

        return archivoReproducir;
    }


    public static void series(String nombreEjercicio, int numeroMovimientos, int segundosDescanso) {


        if (segundosDescanso > 0) {

            System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        } else

            System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        for (int i = 0; i < numeroMovimientos; i++) {

            reproducirArchivo(nombreEjercicio, segundosDescanso);

            System.out.println(nombreEjercicio + " serie: " + i);
        }

    }

}




