import java.util.*;

public class InterClassement {

    public static List<Integer> lentierInterclasser(List<Integer> liste1, List<Integer> liste2) {
        List liste_resultat = new ArrayList<Integer>();

        int place1 = liste1.indexOf(0);
        int place2 = liste2.indexOf(0);

        while (!(liste1.isEmpty()) && !(liste2.isEmpty())) {
            Integer entier1 = liste1.get(place1);
            Integer entier2 = liste1.get(place2);
            if (entier1 < entier2) {
                liste_resultat.add(entier1);
                place1 += 1; // place1 <- suc(liste1, place1)
            } else {
                liste_resultat.add(entier2);
                place2 += 1; // place2 <- suc(liste2, place2)
            }
        }
        if (liste1.isEmpty()) {
            liste_resultat = lentierCopierFinListe(liste2, place2, liste_resultat);
        } else {
            liste_resultat = lentierCopierFinListe(liste1, place1, liste_resultat);
        }
        return liste_resultat;
    }

    public static List lentierCopierFinListe(List<Integer> liste_a, int place_liste_a, List<Integer> liste_b)
    {
        int place_courante = place_liste_a;
        while (!(liste_a.isEmpty()))
        {
            liste_b.add(liste_a.get(place_courante));
            place_courante += 1; // place_courante <- suc(liste_a, place_courante)
        }
        return liste_b;
    }
}
