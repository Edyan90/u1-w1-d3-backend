package ex3;

public class Cliente {
    private int codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private String data;

    public void cliente(int _codiceCliente, String _nome, String _cognome, String _email, String _data) {
        this.codiceCliente = _codiceCliente;
        this.nome = _nome;
        this.cognome = _cognome;
        this.email = _email;
        this.data = _data;
    }
}
