package ex1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(2.5, 5);
        Rettangolo rettangolo2 = new Rettangolo(10, 4.5);
        System.out.println("il perimetro del rettangolo1 è: " + rettangolo1.perimetroRettangolo());
        System.out.println("il perimetro del rettangolo2 è: " + rettangolo2.perimetroRettangolo());
        System.out.println("il area del rettangolo1 è: " + rettangolo1.areaRettangolo());
        System.out.println("il area del rettangolo2 è: " + rettangolo2.areaRettangolo());
        rettangolo1.stampaRettangolo(rettangolo1);
        rettangolo2.stampaRettangolo(rettangolo2);
        rettangolo1.stampaRettangoli(rettangolo1, rettangolo2);
    }
}
