import java.util.Random;

public class CorredorHilo extends Thread {

    Random random = new Random();

    String nombreCorredor;
    int tiempoAleatorio;
    static boolean metaPrimero = false;

    public CorredorHilo(String nombreCorredor) {

        this.nombreCorredor = nombreCorredor;
        tiempoAleatorio = random.nextInt(1000, 3000);
    }

    @Override public void run() {

        try {

            for (int i = 1; i <= 10; i++) {

                System.out.println(nombreCorredor + " avanzó al metro " + i + "\n");
                Thread.sleep(tiempoAleatorio);

                if (i == 10) {

                    if (metaPrimero == false) {

                        System.out.println(nombreCorredor + " llegó primero a la meta. \n");
                        metaPrimero = true;
                    }

                    else {

                    System.out.println(nombreCorredor +" llegó a la meta. \n");

                    }    
                }
            } 
        }

        catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}
