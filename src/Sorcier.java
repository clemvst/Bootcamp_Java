public class Sorcier extends Personnage {
    private double pv;

    public Sorcier(String nom, double points, double pv){
        super (nom,points);
        this.pv=pv;

    }
    public void attaque(Personnage p){
        if (this.points > 0){
            this.points = this.points + p.subitCharme(Math.round(this.points*this.pv));
        }
    }
    public double subitFrappe(double coup){
        this.points = this.points - coup;
        return this.points*this.pv;
    }

    public double subitCharme(double coup){ //Charme sans effet sur Sorcier
        return 0;
    }


}
