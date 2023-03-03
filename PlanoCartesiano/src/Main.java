import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opc;

        System.out.println("PLANO CARTESIANO");

        Scanner comand = new Scanner(System.in);

        Cartesiano plano = new Cartesiano(0,0);

        boolean salir = false;

        while (!salir) {
            System.out.println("1. Arriba");
            System.out.println("2. Derecha");
            System.out.println("3. Abajo");
            System.out.println("4. Izquierda");
            System.out.println("5. Ver coordenadas actuales");
            System.out.println("6 Salir");
            System.out.println("HACER UN MOVIMIENTO: ");
            opc = comand.nextInt();
            if (opc == 1) {
                int t;
                System.out.println("Cuanto desea subir: ");
                t = comand.nextInt();
                plano.arriba(t);
            } else if (opc == 2) {
                int d;
                System.out.println("Cuanto desea mover a la derecha: ");
                d = comand.nextInt();
                plano.derecha(d);
            } else if (opc == 3) {
                int b;
                System.out.println("Cuanto desea bajar: ");
                b = comand.nextInt();
                plano.abajo(b);
            } else if (opc == 4) {
                int i;
                System.out.println("Cuanto desea mover a la izquierda: ");
                i = comand.nextInt();
                plano.izquierda(i);
            } else if (opc == 5) {
                System.out.println("");
                System.out.println(plano.toString());
            } else if (opc == 6){
                salir = true;
            }else {
                System.out.println("Adios");
            }

        }

    }
}