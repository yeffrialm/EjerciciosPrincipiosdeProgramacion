package Principios.Seccion_4;

public class Ejercicio_10 {

    public static void main(String[] args) {


        String[][] listadosCuentas;


        listadosCuentas = new String[][]{{"Cuentas", "Prestamos", "tarjetas"}, {"Cuentas corrientes", "cuentas corrientes", "Prestamos personales", "Tarjeta de credito"}, {"0601222111", "06011111222", "0601222333", "06011111444"}};


        for (int i = 0; i < listadosCuentas.length; i++) {
            for (int j = 0; j < listadosCuentas[i].length; j++) {

                System.out.println(listadosCuentas[i][j]);

            }
        }


    }
}







