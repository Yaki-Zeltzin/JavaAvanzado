package operaciones;
import java.util.Scanner;

public class ClasePadre {

    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Dame el primer valor: ");
        valorUno = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        valorDos = entrada.nextInt();
    }

    public void MostrarResultado(){
        System.out.print(resultado);
    }
}
