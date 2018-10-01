public abstract class Personnage {

    protected String nom;
    protected double points;

    public Personnage(String nom, double points){
        this.nom=nom;
        this.points = points;
    }

    public String getNom(){
        return this.nom ;


    }
    public String mort(){
        if (this.points<=0){
            return "Mort";
        } else{
            return "Vivant";
        }

    }
    public double getVie(){
        return this.points;

    }
    public double addVie(double num){
        return this.points+num;

    }

    public abstract void attaque(Personnage p);


    public abstract double subitFrappe(double coup);


    public abstract double subitCharme(double coup);


    public void afficher(){
        if (this.points<=0){
            System.out.println(this.nom + " est mort.");
        } else {
            System.out.println("Je m'appelle "+this.nom+" et j'ai "+this.points+" points.");
        }
    }

}
