package clases;

public class ClasePrincipal {
    public static void main(String[] args) {

        ProcesoUno hiloUno = new ProcesoUno();
        ProcesoUno hilo3 = new ProcesoUno();
        Thread hiloDos = new Thread(new ProcesoDos());

        hiloUno.run();
        hilo3.start();
        hiloDos.run();
    }
}
