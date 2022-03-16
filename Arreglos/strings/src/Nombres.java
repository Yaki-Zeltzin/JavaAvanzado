import java.util.Scanner;

public class Nombres {
    public static void main(String args[]){

        String nombreUno = "", nombreDos = "";
        Scanner n = new Scanner(System.in);

        System.out.print("Porfavor ingresa el primer nombre: ");
        nombreUno = n.nextLine();

        System.out.print("Por favor dame el segundo nombre: ");
        nombreDos = n.nextLine();

        if(nombreUno.equalsIgnoreCase(nombreDos)){
            System.out.println("Los nombres son iguales.");
        }else{
            System.out.println("Los nombres son diferentes");
        }
    }
}
