package main.java.graphe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GrapheLAdj extends Graphe{
    private HashMap<String, List<String>> liste;

    public GrapheLAdj(){
        this.liste = new HashMap<>();
    }

    @Override
    public void ajouterSommet(String noeud) {
        if (!liste.containsKey(noeud))
            this.liste.put(noeud, new ArrayList<>());
    }

    @Override
    public void ajouterArc(String source, String destination, Integer valeur) {
        if (!contientArc(source, destination) && valeur > 0){
            ajouterSommet(source);
            ajouterSommet(destination);
            Arc arcs = new Arc(source, destination, valeur);
            this.liste.get(source).add(arcs);

            return;
        }
        throw new IllegalArgumentException("L'arc est déjà présent");
    }

    @Override
    public void oterSommet(String noeud) {
        if(!this.liste.containsKey(noeud)){
            this.liste.remove(noeud);


        }
    }

    @Override
    public void oterArc(String source, String destination) {

    }

    @Override
    public List<String> getSommets() {
        return null;
    }

    @Override
    public List<String> getSucc(String sommet) {
        return null;
    }

    @Override
    public int getValuation(String src, String dest) {
        return 0;
    }

    @Override
    public boolean contientSommet(String sommet) {
        return false;
    }

    @Override
    public boolean contientArc(String src, String dest) {
        return false;
    }
}
