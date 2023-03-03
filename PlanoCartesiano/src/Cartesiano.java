public class Cartesiano {

    private int x;
    private int y;

    public Cartesiano() {
    }

    public Cartesiano(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "Cartesiano{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int arriba (int t){

        this.y += t;

        return this.y;
    }
    public int derecha (int d){

        this.x += d;

        return this.x;
    }

    public int abajo (int b){

        this.y -= b;

        return this.y;
    }

    public int izquierda (int i){

        this.x -= i;

        return this.x;
    }


}
