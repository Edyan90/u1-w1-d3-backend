package ex3;

public class Articolo {
    private final long codiceArticolo;
    private final String descrizioneArticolo;
    private final int prezzo;
    private final int numeroPezzi;

    public Articolo(long _codiceArticolo, String _descrizioneArticolo, int _prezzo, int _numeroPezzi) {
        this.codiceArticolo = _codiceArticolo;
        this.descrizioneArticolo = _descrizioneArticolo;
        this.prezzo = _prezzo;
        this.numeroPezzi = _numeroPezzi;
    }
}
