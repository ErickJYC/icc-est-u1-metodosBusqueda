package Principal;

import controles.MetodoBusqueda;
import models.Person;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Person[] personas = new Person[7];
        personas[0] = new Person("juan",101);
        personas[1] = new Person("Maria",102);
        personas[2] = new Person("Carlos",103);
        personas[3] = new Person("Ana",104);
        personas[4] = new Person("Luis",105);
        personas[5] = new Person("Sofia",106);
        personas[6] = new Person("Pedro",107);

        MetodoBusqueda metodoBusqueda = new MetodoBusqueda(personas);
    }

}
