 import java.util.Scanner;

public class InversorPalabras {
    public static void main(String args[]){

        String palabra = "", palabraInvertida = "";
        int longitudPalabra= 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa tu palabra: ");
        palabra = entrada.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0){
            palabraInvertida += palabra.substring(longitudPalabra -1 , longitudPalabra);
            longitudPalabra --;
        }//while

        System.out.print("Tu palabra invertida es: " + palabraInvertida);
        System.out.println();

    }//main
}//class
