package tp7;

public class Cuillere extends Ustensile {
    private double longueur;

    public Cuillere(int annee, double longueur) {
        super(annee);
        this.longueur = longueur;
    }

    
    public double calculerValeur() {
        int age = 2019 - annee;
        if (age < 50) {
            return 0;
        } else {
            return (age - 50);
        }
    }
}