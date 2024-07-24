package ex2;

public class Sim {
    private String numero;
    private double credito;
    private String[] chiamate;

    // COSTRUTTORI (metodi speciali che mi servono a creare un nuovo Studente)
    public Sim(String _numero, double _credito, String[] _chiamate) {
        this.numero = _numero;
        this.credito = _credito;
        this.chiamate = _chiamate;
    }


    public void stampaDatiSim(Sim _sim) {
        System.out.println("numero Sim: " + _sim.numero);
        System.out.println("credito residuo: " + _sim.credito);
        System.out.println("cronologia chiamate: ");
        for (String chiamata : _sim.chiamate) {
            System.out.println(chiamata);
        }
    }
}
