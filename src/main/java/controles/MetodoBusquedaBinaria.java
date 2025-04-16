package controles;

import models.Person;
import views.ShowConsole;

public class MetodoBusquedaBinaria {

    private Person[] people;
    private ShowConsole showConsole;
    public MetodoBusquedaBinaria(Person[] personas){
        this.showConsole = new ShowConsole();
        this.people = personas;
        showConsole.showMes("metodo de busqueda binaria ");
    }
    public int findPersonByCode(int code){
        int bajo = 0;
        int alto = people.length - 1;

        while (bajo <= alto){
            int central = (bajo + alto)/2;

            if (people[central].getCodigo() == code) {
                return central;
            }
            if (people[central].getCodigo() < code) {
                bajo = central +1;
            }else {
                alto = central -1;
            }
        }
        return -1;
    }
    public void showPersonCode(){
        int codeToFind = showConsole.getCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson == -1){
            showConsole.showMes("No hay persona con ese codigo");
        }else {
            showConsole.showMes("Persona con codigo" + codeToFind + "encontrada");
            showConsole.showMes(people[indexPerson].toString());
        }
    }
    private int finPersonByCode(String name){
        return -1;
    }
    public void shoePersonByName(Person[] people){
        for (int i = 0; i < people.length - 1;i++){
            for (int j = 0; j < people.length -1 -i; j++){

            }
        }
    }

}
