import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número para a tabela de multiplicação: ");

    int num = scanner.nextInt();
    System.out.println("\nTabela de multiplicação por " + num);

    for (int i = 1; i <= 10; i++) {
      int result = num * i;
      System.out.println(num + " x " + i + " = " + result);
    }

    scanner.close();
  }
}
