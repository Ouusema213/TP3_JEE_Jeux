package metier;
import java.util.List;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Jeux> prods = metier.getProduitsParMotCle("HP");
for (Jeux p : prods)
System.out.println(p.getNomProduit());
}
}