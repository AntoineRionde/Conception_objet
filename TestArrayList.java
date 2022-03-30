import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Optional;

public class TestArrayList {

    @Test
    public void test_verifie_liste_Oelem()
    {
        MaListe mL = new MaListe();
        mL.estVide();

        assertTrue("erreur", mL.estVide());
    }

    @Test
    public void test_ajoute_elem()
    {
        MaListe ml = new MaListe();
        ml.ajout(0, 15);

        assertEquals("erreur", 1, ml.taille());
        assertEquals("erreur", (Integer) 15, ml.element(0));

    }

    @Test
    public void test_ajoute_elem_fin_liste()
    {
        MaListe ml = new MaListe();
        ml.ajoutFin(30);
        int lastIdx = ml.taille() - 1;
        assertEquals("erreur", (Integer) 30, ml.element(lastIdx));
    }

    @Test
    public void test_indexOf()
    {
        MaListe ml = new MaListe();
        ml.ajoutFin(25);
        assertEquals("erreur", 0, ml.indice(25));
    }
}
