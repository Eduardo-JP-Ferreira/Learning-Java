import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int size;

    do {
      System.out.print("Digite o tamanho da sequência de Fibonacci: ");
      size = scanner.nextInt();

      if (size <= 0) {
        System.out.println("Por favor, digite um numero maior que zero.");
      }

    } while (size <= 0);

    printFibonacciSequence(size);

    scanner.close();
  }

  public static void printFibonacciSequence(int size) {
    int first = 0, second = 1;

    System.out.print("Sequência de Fibonacci de tamanho " + size + ": ");

    for (int i = 0; i < size; i++) {
      System.out.print(first + " ");

      int next = first + second;
      first = second;
      second = next;
    }

    System.out.println();
  }
}
