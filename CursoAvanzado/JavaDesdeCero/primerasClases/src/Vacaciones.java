import java.util.Scanner;

public class Vacaciones {
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        String nombre = "";
        int antiguedad = 0;
        int clave = 0;

        System.out.println("*******************************************************");
        System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("");



        System.out.print("¿Cuál es el nombre del trabajador?");
        nombre = in.nextLine();
        System.out.println("");


        System.out.print("¿Cuál es la clave del trabajador?");
        clave = in.nextInt();
        System.out.println("");


        System.out.print("¿Cuántos años de antiguedad tiene el trabajador?");
        antiguedad = in.nextInt();

        if(clave ==1){

            if (antiguedad == 1){
                System.out.println(nombre+" tiene derecho a 6 dias de vacaciones" );
            }else if(antiguedad >=2 && antiguedad<=6){
                System.out.println(nombre+" tiene derecho a 14 dias de vacaciones" );
            } else if(antiguedad >=7) {
                System.out.println(nombre + " tiene derecho a 20 dias de vacaciones");
            }else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }

        }else if(clave ==2){

            if (antiguedad == 1){
                System.out.println(nombre+" tiene derecho a 7 dias de vacaciones" );
            }else if(antiguedad >=2 && antiguedad<=6){
                System.out.println(nombre+" tiene derecho a 15 dias de vacaciones" );
            } else if(antiguedad >=7) {
                System.out.println(nombre + " tiene derecho a 22 dias de vacaciones");
            }else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }

        }else if(clave ==3){

            if (antiguedad == 1){
                System.out.println(nombre+" tiene derecho a 10 dias de vacaciones" );
            }else if(antiguedad >=2 && antiguedad<=6){
                System.out.println(nombre+" tiene derecho a 20 dias de vacaciones" );
            } else if(antiguedad >=7) {
                System.out.println(nombre + " tiene derecho a 30 dias de vacaciones");
            }else{
                System.out.println("Aún no tienes derecho a vacaciones");
            }

        }else if(clave >4 || clave < 1){
            System.out.println("La clave que ingresó no es válida");
        }




    }
}
