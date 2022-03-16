package perro;
import java.util.Scanner;

public class Perro {

    protected String name, raza, presentar;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("Dame el nombre de tu perro: ");
        name = entrada.nextLine();

        System.out.print("Cual es su raza: ");
        raza = entrada.nextLine();
    }

    public void Presentacion(){
        System.out.println(presentar);
    }

}
