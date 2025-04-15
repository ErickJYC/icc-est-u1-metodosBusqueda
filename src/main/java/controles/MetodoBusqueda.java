package controles;

import models.Person;
import views.ShowConsole;

public class MetodoBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodoBusqueda(Person[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPersonByCode();
    }
    public int busquedaLineal(int [] arreglo, int valor){
        for (int i = 0; i < arreglo.length; i++){
            if( arreglo[i] == valor)
                return i;

        }
        return -1;
    }

    public  int finedPersonByCode(int code){

        for (int i = 0; i < people.length; i++) {
            if (people[i].getCodigo() == code) {
                return i;
            }
        }
        return -1;
    }
    public void showPersonByCode(){
        int codeToFine = showConsole.getCode();
        int indexPerson = finedPersonByCode(codeToFine);
        if (indexPerson >= 0 ){
            showConsole.showMes("Persona encontrada");
            showConsole.showMes(people[indexPerson].toString());


        }else {
            showConsole.showMes("Persona con codigo"+codeToFine);
        }


    }
}
