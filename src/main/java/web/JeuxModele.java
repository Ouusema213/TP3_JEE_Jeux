package web;
import java.util.ArrayList;
import java.util.List;
import metier.Jeux;
public class JeuxModele {
private String motCle;
List<Jeux> produits = new ArrayList<>();
public String getMotCle() {
return motCle;
}
public void setMotCle(String motCle) {
this.motCle = motCle;
}
public List<Jeux> getProduits() {
return produits;
}
public void setProduits(List<Jeux> produits) {
this.produits = produits;
}

}