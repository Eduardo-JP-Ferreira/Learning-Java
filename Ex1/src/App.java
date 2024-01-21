import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
    String signal = "Negativo";
    String type = "Impar";
    System.out.println("Digite um numero:");
    int num = sc.nextInt();

    if (num > 0) {
      signal = "Positivo";
    }
    if (num % 2 == 0) {
      type = "Par";
    }
    System.out.println(num + " é " + type + " e " + signal);
  }
}
