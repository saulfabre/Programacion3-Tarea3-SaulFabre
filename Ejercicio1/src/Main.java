public class Main {
    
    public static void main(String[] args) {
        
        try {

            DescargaHilo archivo1 = new DescargaHilo("Archivo1");
            DescargaHilo archivo2 = new DescargaHilo("Archivo2");
            DescargaHilo archivo3 = new DescargaHilo("Archivo3");

            archivo1.start();
            archivo2.start();
            archivo3.start();
        }

        catch (Exception e) {

            e.printStackTrace();
        }
    }
}
