package LavadoraUno;
import Libreria.LLFunciones;
import java.util.Scanner;

public class LavadoraUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa de color");
        int TipoDeRopa = entrada.nextInt();

        System.out.println("¿Cuántos kilos de ropa?");
        int Kilos = entrada.nextInt();

        LLFunciones mensajero = new LLFunciones(Kilos, TipoDeRopa);
        mensajero.setTipoRopa(2);
        System.out.println("el tipo de ropa es: "+mensajero.getTipoRopa());
        mensajero.CicloFinalizado();
    }//main
}//class
