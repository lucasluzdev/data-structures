public class MinhaApp {
  public static void main(String args[]) {
    Colecao colecao = new Colecao();
    System.out.println("================= BUSCA SEQUENCIAL ================");
    System.out.println("\n\n");
    System.out.println("Posicao do elemento 23: " + colecao.buscaSequencial(23));
    System.out.println("Posicao do elemento 12: " + colecao.buscaSequencial(12));
    System.out.println("Posicao do elemento 76: " + colecao.buscaSequencial(76));
    System.out.println("Posicao do elemento 2: " + colecao.buscaSequencial(2));
    System.out.println("\n\n");
    System.out.println("================= BUSCA SEQUENCIAL ================");
    System.out.println("\n\n");
    System.out.println("Posicao do elemento 23: " + colecao.buscaBinaria(23));
    System.out.println("Posicao do elemento 12: " + colecao.buscaBinaria(12));
    System.out.println("Posicao do elemento 99: " + colecao.buscaBinaria(99));
    System.out.println("Posicao do elemento 2: " + colecao.buscaBinaria(2));
  }
}