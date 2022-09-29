package Principios.Seccion_4;

public class Ejercicio_9 {

    public static void main(String[] args) {


        String[] listadosGastos = {"Disposicion de efectivo en cajero",
                "Pago con tarjeta en gasolinera", "Recibo de fundaciones y o.n.g.",
                "Pago con tarjeta en medicina,farmacio y boticas populares",
                "Pago con tarjetas en gasolinera",
                "18/05/11", "18/05/11", "18/05/11", "17/05/11", "17/05/11",
                "-60.00$", "-56.00$", "-25.00$", "-45.00$", "-60.00$"};

        for (int i = 0; i < listadosGastos.length; i++) {

            if (listadosGastos[i] == "-60.00$" ||
                    listadosGastos[i] == "-56.00$" ||
                    listadosGastos[i] == "-45.00$")
                System.out.println(listadosGastos[i] + " ");
        }
    }

}







