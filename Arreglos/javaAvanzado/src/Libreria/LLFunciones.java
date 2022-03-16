/*
* Clase para las funciones logicas de una lavadora
* */
package Libreria;

public class LLFunciones {

    private int kilos, tipoRopa, llenadoCompleto, lavadoCompleto, secadoCompleto;

    public LLFunciones(int kilos, int tipoRopa){
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }//constructor

    private void Llenado(){
        if(kilos <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }//Llenado

    private void Lavado(){
        Llenado();
        if (llenadoCompleto == 1){
            if(tipoRopa == 1){
                System.out.println("Ropa blanca/ lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else if(tipoRopa == 2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                lavadoCompleto = 1;
            }
        }
    }//Lavado

    private void Secado(){
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }//Secado

    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto == 1){
            System.out.println("Tu ropa ya esta lista");
        }
    }//CicloFinalizado

    //setter y getter
    public int getTipoRopa(){
        return tipoRopa;
    }
    public void setTipoRopa(int tipoRopa){
        this.tipoRopa = tipoRopa;
    }


}//class
