import java.util.ArrayList;
import java.util.List;

public class Groupe {
    private List<Personne> persos;
    public Groupe() {
        this.persos = new ArrayList<Personne>();
    }
    public void ajouterPerso(Personne p) {
        boolean pPres = false;
        for (int i = 0; i < persos.size(); i++) {
            if (persos.get(i) == p)
            {
                pPres = true;
            }
        }
        if (!pPres)
        {
            persos.add(p);
        }
    }

}
