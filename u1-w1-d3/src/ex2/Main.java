package ex2;

public class Main {
    public static void main(String[] args) {
        Chiamata chiamata1 = new Chiamata("34708539", "5.30");
        Chiamata chiamata2 = new Chiamata("3332154", "2.30");
        String[] chiamate = {chiamata1.toString(), chiamata2.toString()};
        Sim sim1 = new Sim("3331544147", 5.5, chiamate);
        sim1.stampaDatiSim(sim1);
    }
}
