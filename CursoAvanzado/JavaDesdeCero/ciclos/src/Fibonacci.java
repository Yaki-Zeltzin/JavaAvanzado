public class Fibonacci {
    public static void main(String args[]){
        int a = 0, b = 1, c = 0;

        System.out.println("Serie con For: ");
        for(int i=0; i<10; i++){
            if(i<9){
                System.out.print(a+",");
                c = a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }
        }
        System.out.println("");

        a = 0;
        b = 1;
        c = 0;
        System.out.println("Sesión con While: ");
        int i = 0;
        while(i<10){
            if(i<9){
                System.out.print(a+",");
                c = a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }
            i++;
        }
        System.out.println(" ");

        a = 0;
        b = 1;
        c = 0;
        int j=0;
        System.out.println("Sesión con Do-While: ");

        do{
            if(j<9){
                System.out.print(a+",");
                c = a+b;
                a=b;
                b=c;
            }else{
                System.out.print(a);
            }
            j++;
        }while(j<10);

    }
}
//i=2;
//a:1
//b:2
//c:2,

//0,1,1,