package nivel2;

import java.util.Objects;

public class Restaurante implements Comparable<Restaurante> {

    private String name;
    private int puntuacion;

    public Restaurante(String name, int puntuacion) {
        this.name = name;
        this.puntuacion = puntuacion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return puntuacion == that.puntuacion && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, puntuacion);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "name='" + name + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }

    //comparing the first restaurant, with the next one.
    @Override
    public int compareTo(Restaurante otherRestaurante) {
        int nameComparison = this.name.compareTo(otherRestaurante.name);
        //int puntuacionComparison = this.puntuacion - otherRestaurante.puntuacion;
        if (nameComparison != 0) {
            return nameComparison;
        } else {

            return  otherRestaurante.puntuacion-this.puntuacion;
        }
    }
}
