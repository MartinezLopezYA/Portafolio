package Cubos;

import java.util.Scanner;

public class Rectangulo {

    Scanner comand = new Scanner(System.in);
    private int alto;
    private int ancho;

    public Rectangulo() {
    }

    public Rectangulo(int alto, int ancho) {

        this.alto = alto;
        this.ancho = ancho;

    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String dibujo(int x, int y){

        for (int i = 0; i < this.alto; i++){
            for (int j = 0; j < (this.ancho-1); j++){
                System.out.print("+");
            }
            System.out.println("+");
        }
        return "\nGenera este cubo ";
    }

    public String deNuevo(){

        System.out.print("Digite nuevo valor para altura: ");
        this.alto = comand.nextInt();
        System.out.print("Digite nuevo valor para anchura: ");
        this.ancho = comand.nextInt();

        return "Datos actualizados: ";
    }

}
