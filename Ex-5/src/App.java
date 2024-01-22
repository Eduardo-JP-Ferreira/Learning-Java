import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
  public static void main(String[] args) throws Exception {

    String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui", };
    String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };

    String[] elementosComuns = encontrarElementosComuns(array1, array2);

    System.out.println("Elementos comuns:");
    for (String elemento : elementosComuns) {
      System.out.println(elemento);
    }
  }

  public static String[] encontrarElementosComuns(String[] array1, String[] array2) {
    Set<String> set1 = new HashSet<>(Arrays.asList(array1));
    Set<String> set2 = new HashSet<>(Arrays.asList(array2));

    set1.retainAll(set2);

    String[] elementosComuns = new String[set1.size()];
    set1.toArray(elementosComuns);

    return elementosComuns;
  }
}
