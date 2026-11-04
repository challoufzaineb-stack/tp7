package tp7;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int annee, double rayon) {
        super(annee);
        this.rayon = rayon;
    }

    
    public double calculerSurface() {
        return 3.14 * rayon * rayon;
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