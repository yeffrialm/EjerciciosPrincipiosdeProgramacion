package Principios.Seccion_5;

public class Ejercicio_4 {


    public static void main(String[] args) {

        ejercicio("Abdominales", 15, 30, 20, 45, 25, 120);

    }

    static String reproducirArchivo(String nombreArchivo, int segundosDescanso) {

        String archivoReproducir = "";

        if (segundosDescanso > 0) {

            archivoReproducir = "tomar un descanso de: " + segundosDescanso + " segundos";

        } else

            archivoReproducir = "** Se esta reproduciendo el ejercicio: " + nombreArchivo;

        return archivoReproducir;
    }


    public static String series(String nombreEjercicio, int numeroMovimientos, int segundosDescanso) {


        if (segundosDescanso > 0) {

            System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        } else

            System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        for (int i = 0; i < numeroMovimientos; i++) {

            reproducirArchivo(nombreEjercicio, segundosDescanso);

            System.out.println(nombreEjercicio + " serie: " + i);
        }

        return "";
    }


    public static String ejercicio(String nombreEjercicio, int repeticion1, int descanso1, int repeticion2, int descanso2, int repeticion3, int descansoFinal) {
        series(nombreEjercicio, repeticion1, descanso1);
        series(nombreEjercicio, repeticion2, descanso2);
        series(nombreEjercicio, repeticion3, descansoFinal);
        return "";
    }

}




