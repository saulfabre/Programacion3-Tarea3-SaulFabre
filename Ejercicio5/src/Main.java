import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int op;

        do {

            op = mostrarMenu();

            switch (op) {
                case 1:
                    agregarActividad();
                    break;

                case 2:
                    mostrarActividades();
                    break;
            }
        } while (op != 3);  
    }

    public static int mostrarMenu() {

        int op;

        System.out.println("\n1. Agregar actividad ");
        System.out.println("2. Mostrar actividades ");
        System.out.println("3. Salir \n");
        System.out.print("Opcion: ");

        op = sc.nextInt();
        sc.nextLine();

        return op;
    }

    public static void agregarActividad() {

        File archivo = new File("actividades.txt");

        try {

        FileWriter fw = new FileWriter(archivo, true);
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.print("\nIngrese una actividad: ");
        String actividad = sc.nextLine();

        bw.write(actividad);
        bw.newLine();
        bw.close();
    }

        catch(Exception e) {

        }
    }
    
    public static void mostrarActividades() {

        File archivo = new File("actividades.txt");

        if (!archivo.exists()) {
            System.out.println("El archivo no existe. ");
            return;
        }

        try {

        FileReader fr = new FileReader(archivo);
        String linea;

        BufferedReader br = new BufferedReader(fr);

        while ((linea=br.readLine()) != null) {

            System.out.println(linea);   
        }

        fr.close();

        }

        catch(Exception e) {
            
        }
    }
}
