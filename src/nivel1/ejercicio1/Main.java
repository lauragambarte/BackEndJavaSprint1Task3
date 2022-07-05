package nivel1.ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Mes> meses = new ArrayList<>();
        Mes mes1 = new Mes("enero");
        Mes mes2  =new Mes("febrero");
        Mes mes3  =new Mes("marzo");
        Mes mes4  =new Mes("abril");
        Mes mes5  =new Mes("mayo");
        Mes mes6  =new Mes("junio");
        Mes mes7  =new Mes("julio");
        Mes mes9  =new Mes("septiembre");
        Mes mes10  =new Mes("octubre");
        Mes mes11 =new Mes("noviembre");
        Mes mes12  =new Mes("diciembre");
        meses.add(mes1);
        meses.add(mes2);
        meses.add(mes3);
        meses.add(mes4);
        meses.add(mes5);
        meses.add(mes6);
        meses.add(mes7);
        meses.add(mes9);
        meses.add(mes10);
        meses.add(mes11);
        meses.add(mes12);
//DEMUESTRO QUE ARRAYLIST MANTIENE EL ORDEN CORRECTO
        for (int i = 0; i < meses.size(); i++) {
            System.out.println(meses.get(i).getName());
        }
//AGREGO AGOSTO y DEMUESTRO QUE MANTIENE EL ORDEN CORRECTO DE INSERCIÓN
        Mes mes8  =new Mes("agosto");
        meses.add(mes8);
        for (int i = 0; i < meses.size(); i++) {
            System.out.println(meses.get(i).getName());
        }
//AGREGO SEPTIEMBRE DUPLICADO PARA DEMOSTRAR QUE HASHSET NO DUPLICA VALORES.
        Mes mes9bis =new Mes("septiembre");
        System.out.println("-----------------------");
        meses.add(mes9bis);
//CREACIÓN DE HASHSET, NO DUPLICA VALORES
        HashSet<Mes> mesHashSet = new HashSet<>(meses);
        //creating a new hashset that contains same elements of arraylist meses. new calls the constructor to create a new object
//variable hashSet
//RECORRO HASHSET CON FOR
        for (Mes value : mesHashSet)
        {
            System.out.println(value);
            //I need to create tostring in clase nivel1.ejercicio1.Mes to print the mes in a hashset

        }
//RECORRO HASHSET CON ITERADOR
        System.out.println("-----------------------");
        Iterator<Mes> it = mesHashSet.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}