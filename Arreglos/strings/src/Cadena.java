import java.util.Scanner;
public class Cadena {
    public static void main(String args[]){

        String cadenaOriginal = "", cadenaSubdtraccion="";
        int numCaracteres=0, desde=0, hasta=0;
        Scanner in = new Scanner(System.in);

        System.out.print("Introduce una cadena de caracteres: ");
        cadenaOriginal = in.nextLine();

        numCaracteres = cadenaOriginal.length();

        System.out.println("La cadena de caracteres "+cadenaOriginal+" posee "+numCaracteres+"caracteres.");

        System.out.print("¿ Desde qué caracter deseas obtener la nueva cadena?");
        desde=in.nextInt();

        System.out.print("¿ Hasta qué caracter deseas obtener la nueva cadena?");
        hasta = in.nextInt();

        cadenaSubdtraccion = cadenaOriginal.substring(desde,hasta);
        System.out.println("Tu nueva cadena es " +cadenaSubdtraccion );



    }
}
