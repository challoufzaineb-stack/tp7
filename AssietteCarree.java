package tp7;

public class AssietteCarree extends Assiette {
    private double cote;

    public AssietteCarree(int annee, double cote) {
        super(annee);
        this.cote = cote;
    }

    
    public double calculerSurface() {
        return cote * cote;
    }

    
  
    public double calculerValeur() {
        int age = 2019 - annee;
        double valeurRonde;
        
        if (age < 50) {
            valeurRonde = 0;
        } else {
            valeurRonde = age - 50;
        }
        
        return 5 * valeurRonde; 
    }
}