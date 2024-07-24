package ex2;

public class Chiamata {
    private final String numero;
    private final String minuti;

    public Chiamata(String _numero, String _minuti) {
        this.numero = _numero;
        this.minuti = _minuti;
    }

    @Override
    public String toString() {
        return "Numero: " + this.numero + ", Minuti: " + this.minuti;
    }
}