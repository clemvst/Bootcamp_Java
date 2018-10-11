public class Main {

    public static void main(String[] args) {

        String sorciers[]={"Iris","Corentin","Noemie","Nathan","Clem"};
        String monstres[]={"Vaxou","PEM","Henaff","Zanni","Bonfante"};
        Personnage s[]= new Personnage[10];
        for (int i=0;i<sorciers.length;i++) {
            s[i] = new Sorcier(sorciers[i], Math.round(Math.random() * 100), Math.random());
            s[i].afficher();
        }
        for (int i=0;i<monstres.length;i++) {
            s[i+4] = new Monstre(monstres[i], Math.round(Math.random() * 100));
            s[i+4].afficher();
        }
        for (int i=0;i<10;i++){
            int joueur1 = (int) Math.round(Math.random()*(s.length-1));
            int joueur2 = (int) Math.round(Math.random()*(s.length-1));
            s[joueur1].attaque(s[joueur2]);
            s[joueur1].afficher();
        }

    }
}
