public class Operacionees {
    public static void main(String args[]){

        int numUno = 5, numDos = 3, resultado = 0;
        int parametro = 1;

        switch (parametro){
            case 1: resultado = numUno + numDos;
                System.out.println(resultado);
                break;
            case 2: resultado = numUno - numDos;
                System.out.println(resultado);
                break;
            case 3: resultado = numUno * numDos;
                System.out.println(resultado);
                break;
            case 4: resultado = numUno / numDos;
                System.out.println(resultado);
                break;
            default:
                System.out.println("Error la opción no existe");
                break;
        }


    }
}//class
