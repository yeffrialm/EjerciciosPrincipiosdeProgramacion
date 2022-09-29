package Principios.Seccion_4;

public class Ejercicio_5 {

    public static void main(String[] args) {

        int saldoParaCompra = 10;
        int valorTotalCompra = 0;
        int precioProducto = 2;


        while (saldoParaCompra > valorTotalCompra) {
            System.out.println("Saldo para la compra: " + saldoParaCompra);
            System.out.println("Añadir productos al carrito");
            System.out.println("Precio producto: " + precioProducto);
            valorTotalCompra += precioProducto;
            saldoParaCompra -= valorTotalCompra;
            System.out.println("valor total de la compra = " + valorTotalCompra);
            valorTotalCompra = 0;


        }


    }


}
