package paquete1;

public class AtributosMetodos {

    protected int valorUno;
    protected int valorDos;
    protected String valorTres;

    protected void metodoErnesto(){
    }


    //PUBLIC: Se puede acceder a esta clase desde su mismo paquete y tambien de otro.
    //PRIVATE: No se puede acceder desde ningun paquete a menso que se creén los setter y getter.
    //PROTECTED: Solo se puede acceder a la clase desde el mismo paquete y por herenia no importa que se encuentre en otra clase, pero si se encuentra en otro paquete no es posible acceder.

}
