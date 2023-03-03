package Cubos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner comand = new Scanner(System.in);
        Rectangulo cubo = new Rectangulo();

        boolean salir = false;
        System.out.print("Digite el alto que va a llevar el rectángulo: ");
        int alto = comand.nextInt();
        cubo.setAlto(alto);
        System.out.print("Digite el ancho que va a llevar el rectángulo: ");
        int ancho = comand.nextInt();
        cubo.setAncho(ancho);

        while (!salir){

            System.out.println("\n1. Ver dibujo de la figura: ");
            System.out.println("2. Digitar otras medidas: ");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            int opc = comand.nextInt();

            switch (opc){

                case 1:
                    System.out.println(cubo.dibujo(cubo.getAlto(), cubo.getAncho()));
                    System.out.println();
                    break;
                case 2:
                    System.out.println(cubo.deNuevo());
                    System.out.println();
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción invalida");
            }

        }

    }
}