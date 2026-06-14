public class Main {

    public static void main(String[] args) {

        try {

            CorredorHilo corredor1 = new CorredorHilo("Maria");
            CorredorHilo corredor2 = new CorredorHilo("Pedro");
            CorredorHilo corredor3 = new CorredorHilo("Juan");

            System.out.println("Estado inicial: ");
            System.out.println(corredor1.getState());
            System.out.println(corredor2.getState());
            System.out.println(corredor3.getState() + "\n");

            corredor1.start();
            corredor2.start();
            corredor3.start();

            Thread.sleep(40000);

            System.out.println("Estado final: ");
            System.out.println(corredor1.getState());
            System.out.println(corredor2.getState());
            System.out.println(corredor3.getState());
        }

        catch (Exception e) {

            e.printStackTrace();
        }   
    } 
}
