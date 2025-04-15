package views;

import java.util.Scanner;

public class ShowConsole {
    Scanner scanner = new Scanner(System.in);
    public void showMenu(){
        System.out.println("Metodo Busqueda");
    }
    public int getCode(){
        System.out.println("Ingrese Codigo");
        int codigo = scanner.nextInt();
        System.out.println("Codigo ingresado"+ codigo);
        return codigo;
    }
    public void showMes(String messege){
        System.out.println(messege);
    }
}
