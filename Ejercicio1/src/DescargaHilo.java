public class DescargaHilo extends Thread {

    private String nombreArchivo;

    public DescargaHilo(String nombreArchivo) {

        this.nombreArchivo = nombreArchivo;
    }

    @Override public void run() {

        System.out.println("Descargando " + nombreArchivo + "...\n");

        try {
            
        for (int i = 0; i <= 100; i+=10) {

            System.out.println(nombreArchivo + " " + i + "%\n");
            Thread.sleep(1000);
        }
    }
        catch(InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println(nombreArchivo + " completado.\n");
    }
}
