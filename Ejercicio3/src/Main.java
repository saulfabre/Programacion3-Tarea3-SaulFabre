import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            UsuarioService.validarEdad(edad);
        }

        catch (Exception e) {

            System.out.println(e.getMessage());
        }  
    }  
}
