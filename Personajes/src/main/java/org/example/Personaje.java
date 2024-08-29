package org.example;

public abstract class Personaje {
        protected int salud;

    public Personaje() {
    }

    public Personaje(int saludInicial) {
            this.salud = saludInicial;
        }

        public int getSalud() {
            return salud;
        }

        public void setSalud(int salud) {
            this.salud = salud;
        }

    @Override
    public String toString() {
        return "Personaje{" +
                "salud=" + salud +
                '}';
    }

    public abstract void entrenar();
    }


