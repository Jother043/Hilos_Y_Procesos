public class Carrera{
    public static void main(String[] args) {
        Corredor [] corredores = new Corredor[5];

        for (int i = 0; i < corredores.length; i++) {
            corredores[i] = new Corredor("Corredor " + (i + 1));
            corredores[i].start();
        }

        for (Corredor corredor : corredores) {
            corredor.join();
        }
    }
}
