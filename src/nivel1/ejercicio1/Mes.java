package nivel1.ejercicio1;

import java.util.Objects;

public class Mes {
    private String name;

    public Mes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
//Generate code equals and hashcode from the intelliJ
    @Override
    //object o is mes9bis, this is mes9
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mes mes = (Mes) o;
        return name.equals(mes.name); //comparing both string septiembre
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    //if two objects are equal they should have the same hashCode, fast way to realize if two objects are different w/o running equals.
}
