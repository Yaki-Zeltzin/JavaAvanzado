package main;
import operaciones.ClaseHija_Suma;
import operaciones.ClaeHija_Resta;

public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        ClaeHija_Resta mensajeroResta = new ClaeHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.println("El resultado de la resta es: ");
        mensajeroResta.MostrarResultado();
    }//main
}//class