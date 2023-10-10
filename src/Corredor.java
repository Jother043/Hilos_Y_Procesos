import java.util.Random;

public class Corredor implements Runnable {
    String name;

    public Corredor(String name) {
        this.name = name;
    }

    /**
     * Este método se encarga de ejecutar el hilo del corredor 10 veces
     * @return the name
     */
    @Override
    public void run() {

        try {
            System.out.println(name + " está listo para empezar.");
            Thread.sleep(new Random().nextInt(1000)); // Esperar un tiempo aleatorio antes de comenzar
            System.out.println(name + " ha comenzado la carrera.");

            for (int tramo = 1; tramo <= 10; tramo++) {
                int tiempoTramo = new Random().nextInt(500); // Tiempo aleatorio para cada tramo
                Thread.sleep(tiempoTramo);
                System.out.println(name + " ha completado el tramo " + tramo + " en " + tiempoTramo + " ms.");
            }

            System.out.println(name + " ha terminado la carrera.");
        } catch (InterruptedException e) {
            System.out.println(name + " ha sido interrumpido.");
        }

    }

    /**
     * Este método se encarga de iniciar el hilo del corredor
     * @return the name
     */
    public void start() {
        Thread hilo = new Thread(this);
        hilo.start();
    }

    /**
     * Este método se encarga de esperar a que el hilo del corredor termine
     * @return the name
     */
    public void join() {
        Thread hilo = new Thread(this);
        try {
            hilo.join();
        } catch (InterruptedException e) {
            System.out.println("La carrera ha sido interrumpida.");
        }
    }
}
