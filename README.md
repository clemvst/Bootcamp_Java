# Bootcamp_java


## Principe : Classes abstraites

Il s'agit de créer un jeu dans lequel des personnages s’affrontent. Un person-
nage est soit un monstre soit un sorcier. Les règles de ce jeu sont les suivantes.

## Les personnages 
Un personnage = un nom et des points de vie. 
Si le nombre de points de vie est < = 0, alors il est mort. 
On représentera un personnage par la classe Personnage.

Plusieurs méthodes permettent de gérer l’état interne d’un personnage :
1. Affichage : si p est la référence à un personnage, l’appel à System.out.println(p) devra afficher quelque chose comme “Je m’appelle Dracula et j’ai 32 points de vie.” ou “Dracula est mort.”
2. La méthode getNom() retourne le nom du personnage.
3. La méthode mort() indique si le personnage est mort ou pas.
4. La méthode getVie() retourne le nombre de points de vie.
5. La méthode addVie(int num) permet d’ajouter num points de vie (valeur éventuellement négative).

De plus, un personnage peut attaquer un autre personnage et subir réciproquement deux sortes d’attaques.
1. La méthode void attaque(Personnage p) : ce qui se passe quand le personnage rencontre un autre personnage. Son attaque dépend de son identité de monstre ou de sorcier.
2. La méthode int subitFrappe(int coup) : ce qui se passe quand le personnage est frappé par un monstre.
3. La méthode int subitCharme(int coup) : ce qui se passe quand le personnage est charmé par un sorcier.
Les monstres Un monstre est un personnage. On représentera les monstres par la classe Monstre.

## 1. Attaque d’un monstre :
(a) Si le monstre est mort, il ne fait rien.
(b) Sinon, il frappe l’autre personnage avec une force égale à la moitié de ses propres points de vie; éventuellement, cela lui fait perdre des points de vie (voir la définition de subitFrappe).
2. Quand un monstre est frappé avec une force coup, ses points de vie sont décrémentés de coup. En retour, il blesse le personnage qui le frappe avec une blessure égale à la moitié de ses points de vie, valeur de laquelle le personnage qui l’a frappé devra décrémenter ses points de vie.
3. Quand un monstre est charmé avec une force coup, ses points de vie sont décrémentés de coup. En retour, il fournit au personnage qui le charme un gain égal à la moitié de ses points de vie, valeur de laquelle le personnage qui l’a charmé
devra incrémenter ses points de vie.
Les sorciers Un sorcier est un personnage. On représentera les sorciers par la classe Sorcier. Un sorcier a un attribut pouvoir qui est un nombre réel tiré au hasard compris entre 0 et 1 (Utiliser Math.random()).

## 1. Attaque d’un sorcier :
(a) S’il est mort, il ne fait rien.
(b) Sinon il charme le personnage rencontré avec une force égale à la valeur de ses propres points de vie multipliée par son pouvoir; éventuellement, cela lui fait gagner des points de vie (voir la définition de subitCharme).
2. Quand un sorcier est frappé avec une force coup, ses points de vie sont décrémentés de coup. En retour, il blesse le personnage qui le frappe avec une blessure égale à la valeur de ses points de vie multipliée par son pouvoir, valeur de laquelle le personnage qui l’a frappé devra décrémenter ses points de vie.
3. Aucun charme n’a d’effet sur un sorcier.

## Le jeu
On crée un tableau qui comporte 5 monstres et 5 sorciers. 
On leur donne des noms (e.g. au clavier) et on tire au hasard le nombre de points de vie de chaque personnage. Au départ, les points de vie sont ≤ 100.
On organise ensuite un combat entre les personnages à l’aide d’une boucle. A chaque itération, deux personnages sont tirés au hasard : le premier attaquera (une seule fois) le second.

## TD informatique (Ecole des Mines de Nancy - P.E. Moreau - 2018)

## A améliorer :
Classe sorcier non terminée, fonctionnement global à revoir.
