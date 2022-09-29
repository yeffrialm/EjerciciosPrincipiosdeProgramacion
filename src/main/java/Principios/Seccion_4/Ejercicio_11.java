package Principios.Seccion_4;

public class Ejercicio_11 {

    public static void main(String[] args) {


        String consumoElectrico = "C";
        double valorCasa = 75000;

        switch (consumoElectrico) {

            case "A":
                valorCasa += 0.10 * valorCasa;
                System.out.println("consumo Electrico 1= " + consumoElectrico + " Valor de la casa: " + valorCasa);
                break;
            case "B":
                valorCasa += 0.20 * valorCasa;
                System.out.println("consumo Electrico 2= " + consumoElectrico + " Valor de la casa: " + valorCasa);
                break;
            case "D":
                valorCasa -= 0.10 * valorCasa;
                System.out.println("consumo Electrico 3= " + consumoElectrico + " Valor de la casa: " + valorCasa);
                break;
            case "E":
                valorCasa -= 0.20 * valorCasa;
                System.out.println("consumo Electrico 4= " + consumoElectrico + " Valor de la casa: " + valorCasa);
                break;
            default:
                System.out.println("consumo Electrico = " + consumoElectrico + " Valor de la casa: " + valorCasa);
        }


    }
}







