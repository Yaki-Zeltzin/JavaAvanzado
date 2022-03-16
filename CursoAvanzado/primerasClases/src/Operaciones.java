public class Operaciones {
    public static void main(String args[]){
        int operacion = 1;
        int numeroUno = 4;
        int numeroDos = 8;
        int resultado = 0;

        if(operacion == 1){
            resultado = numeroUno + numeroDos;
            System.out.println("el resultado de tu suma es : "+resultado);
        }else if(operacion == 2){
            resultado = numeroUno - numeroDos;
            System.out.println("el resultado de tu resta es : "+resultado);
        }else if(operacion == 3){
            resultado = numeroUno * numeroDos;
            System.out.println("el resultado de tu multiplicacion es : "+resultado);
        } else if(operacion == 4){
        resultado = numeroUno / numeroDos;
            System.out.println("el resultado de tu division es : "+resultado);
        }else if(operacion >5 || operacion<1){
            System.out.println("Ingresa un número del 1 al 4 por favor");
    }
    }//main
}//class
