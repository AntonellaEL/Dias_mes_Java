package dev.anto;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
   
    public static void main(String[] args) {
        DiasDelMes enero = new DiasDelMes(1);
        System.out.println("Enero tiene " + enero.getNumDias() + " días.");

        DiasDelMes febrero = new DiasDelMes(8);
        System.out.println("Agosto tiene " + febrero.getNumDias() + " días.");

        DiasDelMes abril = new DiasDelMes(4);
        System.out.println("Abril tiene " + abril.getNumDias() + " días.");

        DiasDelMes mayo = new DiasDelMes(5);
        System.out.println("Mayo tiene " + mayo.getNumDias() + " días.");
    }
}
