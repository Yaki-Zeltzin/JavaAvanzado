import java.util.Scanner;
public class Login {
    public static void main(String args[]){
    String usuario = "", contrasena = "";
    Scanner entrada = new Scanner(System.in);

        System.out.print("Escribe tu usuario: ");
        usuario = entrada.nextLine();

        System.out.print("Escribe tu contraseña: ");
        contrasena = entrada.nextLine();

        if(usuario.equals("Yaki") && contrasena.equals("123456")){
            System.out.println("El inicio de sesion fue exitoso");
        }else{
            System.out.println("Usuario o contraseña son incorrectos");
        }

    }
}
