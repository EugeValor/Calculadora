package org.example;

public class Espadachin extends Personaje {
    private int ataque;

    public Espadachin() {
    }

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }


    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Espadachin{" +
                "ataque=" + ataque +
                ", salud=" + salud +
                '}';
    }

    @Override
    public void entrenar() {
        this.ataque += 10;
    }
}


