import java.util.Scanner;

public class MainApp {
  public static void main(String args[]) {

    Scanner teclado = new Scanner(System.in);
    int vetor[] = new int[Integer.parseInt(args[0])];
    int opcao = Integer.parseInt(args[1]);

    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = teclado.nextInt();
    }

    Ordenacao ordenacao = new Ordenacao();
    ordenacao.setVetor(vetor);

    long inicio = System.currentTimeMillis();
    if (opcao == 1) {
      ordenacao.bubble();
    } else if (opcao == 2) {
      ordenacao.selection();
    } else if (opcao == 3) {
      ordenacao.insertion();
    } else if (opcao == 4) {

      int[] itens = ordenacao.getVetor();
      ordenacao.quick(0, itens.length - 1);
    }
    long fim = System.currentTimeMillis();
    System.out.println("Demorou para ordenar: " + (fim - inicio) + "ms.");

    // ordenacao.mostrar();
  }
}