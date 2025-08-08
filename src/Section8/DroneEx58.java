package src.Section8;

public class DroneEx58 {
    public int id;
    public double altura;
    public double bateria;

    public void subir(double metros) {
        this.altura += metros;
        double consumo = (metros / 10) * 1;
        this.bateria -= consumo;
    }

    public void descer(double metros) {
        this.altura -= metros;
    }

    @Override
    public String toString() {
         return "Status: Altura = " + String.format("%.2f",altura) + " | Bateria = " + String.format("%.2f",bateria) + "%";
    }
}
