public class Promedio {
    public static void main(String args[]){

        int matematicas = 8;
        int quimica = 6;
        int español = 6;
        int promedio = 0;

        promedio = (matematicas + quimica + español)/3;

        if(promedio >= 6){
            System.out.println("Aprobaste con " + promedio);
        }else{
            System.out.println("Lo siento tu calificacion es de : " + promedio);
        }
    }
}//class
