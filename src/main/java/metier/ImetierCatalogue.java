package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Jeux> getProduitsParMotCle(String mc);
public void addProduit(Jeux p);
}