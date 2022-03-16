package mainperro;
import perro.Coba;
import perro.Mateo;

public class MainPerro {
    public static void main(String[] args) {

        Coba mensajeroPerro = new Coba();
        mensajeroPerro.PedirDatos();
        mensajeroPerro.Presentar();
        System.out.println("mi perro se llama: ");
        mensajeroPerro.Presentacion();
}
}
