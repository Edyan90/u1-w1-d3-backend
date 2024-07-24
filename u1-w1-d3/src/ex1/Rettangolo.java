package ex1;

public class Rettangolo {
    // ATTRIBUTI (caratteristiche di tutti gli studenti)
    private double latoA;
    private double latoB;

    // COSTRUTTORI (metodi speciali che mi servono a creare un nuovo Studente)
    public Rettangolo(double _latoA, double _latoB) {
        // Quando creiamo dei costruttori è fondamentale stabilire quali attributi debbano venir valorizzati con valori
        // provenienti dall'esterno (PARAMETRI DEL COSTRUTTORE) e quali no. Ad esempio l'id non lo sceglierà l'utente
        // ma gli verrà assegnato uno generato in maniera casuale
        this.latoA = _latoA;
        this.latoB = _latoB;
    }


    // METODI (ovvero le azioni che un oggetto Studente potrà eseguire)
    public double perimetroRettangolo() {
        return (latoA + latoB) * 2;
    }

    public double areaRettangolo() {
        return latoA * latoB;
    }

    public void stampaRettangolo(Rettangolo _rettangolo) {
        System.out.println("il perimetro del rettangolo è: " + _rettangolo.perimetroRettangolo());
        System.out.println("il area del rettangolo è: " + _rettangolo.areaRettangolo());
    }

    public void stampaRettangoli(Rettangolo rettangolo1, Rettangolo rettangolo2) {
        System.out.println("il perimetro del primo rettangolo è: " + rettangolo1.perimetroRettangolo());
        System.out.println("il perimetro del secondo rettangolo è: " + rettangolo2.perimetroRettangolo());
        System.out.println("il area del primo rettangolo è: " + rettangolo1.areaRettangolo());
        System.out.println("il area del secondo rettangolo è: " + rettangolo2.areaRettangolo());
        System.out.println("la somma dei perimetri dei rettangoli è: " + (rettangolo1.perimetroRettangolo() + rettangolo2.perimetroRettangolo()));
        System.out.println("la somma dei area dei rettangoli è: " + (rettangolo1.areaRettangolo() + rettangolo2.areaRettangolo()));

    }

}
