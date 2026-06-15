import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op = 0;

        do {

            try {

            op = mostrarMenu();

            if (op == 5) {
                break;
            }

            System.out.print("\nIngrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("\nIngrese el segundo número: ");
            double num2 = sc.nextDouble();
            

             switch (op) {
                case 1:
                    System.out.println("Resultado: " + sumar(num1, num2));
                    break;

                case 2:
                    System.out.println("Resultado: " + restar(num1, num2));
                    break;

                case 3:
                    System.out.println("Resultado: " + multiplicar(num1, num2));
                    break;

                case 4:
                    System.out.println("Resultado: " + dividir(num1, num2));
                    break;
        }
    } 
        catch(ArithmeticException e) {

            System.out.println("\nError: No se puede dividir entre cero. ");
        }

        catch(InputMismatchException e) {

            System.out.println("\nError: El dato ingresado debe ser un número.");
            sc.nextLine();
        }

        finally {
            System.out.println("\nProceso finalizado. \n");
        }

    } while (op != 5);         
} 
    public static int mostrarMenu() {

        int op;

        System.out.println("1. Sumar ");
        System.out.println("2. Restar ");
        System.out.println("3. Multiplicar ");
        System.out.println("4. Dividir ");
        System.out.println("5. Salir \n");
        System.out.print("Opcion: ");

        op = sc.nextInt();
        sc.nextLine();

        return op;
    }

    public static double sumar(double num1, double num2) {

        return num1 + num2;
    }

    public static double restar(double num1, double num2) {

        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {

        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {

        if (num2 == 0) {

            throw new ArithmeticException();
        }

        return num1 / num2;
    }
}