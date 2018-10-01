public class Monstre extends Personnage {

    public Monstre(String nom, double points) {
        super(nom, points);
    }

    public void attaque(Personnage p){
        if (this.points > 0){
            this.subitFrappe(this.points/2);
            this.points=this.points-p.subitFrappe(this.points/2);
        }
    }
    public double subitFrappe(double coup){
        this.points = this.points - coup;
        return this.points;
    }

    public double subitCharme(double coup){
        this.points = this.points - coup;
        return this.points/2;
    }


}
