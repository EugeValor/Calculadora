package org.example;

public class Mago extends Personaje {
    private String magia;

    public Mago() {
    }

    public Mago(int salud, String magia) {
        super(salud);
        this.magia = magia;
    }


    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "magia='" + magia + '\'' +
                ", salud=" + salud +
                '}';
    }

    @Override
    public void entrenar() {

    }
}


