import java.util.ArrayList;

public class MaListe {
    ArrayList<Integer> arrayList;

    public MaListe()
    {
        arrayList = new ArrayList<Integer>();
    }

    public int taille()
    {
        return arrayList.size();
    }

    public void ajout(int index, Integer elem)
    {
        arrayList.add(index, elem);
    }

    public void ajoutFin(Integer elem)
    {
        arrayList.add(elem);
    }

    public Integer element(int index)
    {
        return arrayList.get(index);
    }

    public int indice(Integer elem)
    {
        return arrayList.indexOf(elem);

    }

    public MaListe(ArrayList<Integer> listeACopier)
    {
        arrayList = listeACopier;
    }

    public boolean estVide()
    {
        return arrayList.isEmpty();
    }

    public void supprime(Integer elem)
    {
        arrayList.remove(elem);
    }

}
