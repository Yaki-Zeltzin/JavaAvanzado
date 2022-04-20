package main;

import operaciones.ClaseHija_Suma;


public class ClasePrincipal {
    public static void main(String[] args) {
        ClaseHija_Suma mensajeroSuma = new ClaseHija_Suma();
        mensajeroSuma.PedirDatos();
        mensajeroSuma.Sumar();
        System.out.println("El resultado de la suma es: ");
        mensajeroSuma.MostrarResultado();

        ClaeHija_Resta mensajeroResta = new ClaeHija_Resta();
        mensajeroResta.PedirDatos();
        mensajeroResta.Restar();
        System.out.print("El resultado de tu resta es: ");
        mensajeroResta.MostrarResultado();
    }//main
}//class
