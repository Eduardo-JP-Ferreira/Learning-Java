import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número referente ao tamanho da pirâmide:");
    int num = scanner.nextInt();
    System.out.print("\n");

    for (int i = 1; i <= num; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }

    scanner.close();
  }
}