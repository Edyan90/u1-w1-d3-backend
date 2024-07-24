package ex3;

public class Carrello {
    private final Cliente clienteAssociato;
    private final Articolo[] elencoArticoli;
    private final int totale;

    public Carrello(Cliente _clienteAssociato, Articolo[] _elencoArticoli, int _totale) {
        this.clienteAssociato = _clienteAssociato;
        this.elencoArticoli = _elencoArticoli;
        this.totale = _totale;
    }
}
