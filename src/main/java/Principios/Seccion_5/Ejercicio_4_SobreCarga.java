package Principios.Seccion_5;

public class Ejercicio_4_SobreCarga {


    public static void main(String[] args) {

        ejercicio("Abdominales", 1, 30, 2, 45, 3, 120);

    }

    static String reproducirArchivo(String nombreArchivo, int segundosDescanso) {

        String archivoReproducir = "";

//        if (segundosDescanso > 0) {
//
//            archivoReproducir = "tomar un descanso de: " + segundosDescanso + " segundos";
//
//        } else

        archivoReproducir = "** Se esta reproduciendo el ejercicio: " + nombreArchivo;

        return archivoReproducir;
    }


    public static String series(String nombreEjercicio, int numeroMovimientos, int segundosDescanso) {


        System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        for (int i = 0; i < numeroMovimientos; i++) {

            reproducirArchivo(nombreEjercicio, segundosDescanso);

            System.out.println(nombreEjercicio + " serie: " + i);
        }

        if (segundosDescanso > 0)

            System.out.println(reproducirArchivo(nombreEjercicio, segundosDescanso));

        return "";
    }


    public static String ejercicio(String nombreEjercicio, int repeticion1, int descanso1, int repeticion2, int descanso2, int repeticion3, int descansoFinal) {
        series(nombreEjercicio, repeticion1, descanso1);
        series(nombreEjercicio, repeticion2, descanso2);
        series(nombreEjercicio, repeticion3, descansoFinal);
        return "";
    }

}




