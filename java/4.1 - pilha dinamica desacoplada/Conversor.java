public class Conversor {
  public static void main(String args[]) {
    int numero = Integer.parseInt(args[0]);
    IPilha p;
    int resto;

    try {

      p = (IPilha) Class.forName(args[1]).newInstance();

      while (numero != 0) {
        resto = numero % 2; // pega o resto da divisão deste numero por 2 (vale 0 ou 1)
        p.push(resto);
        numero = numero / 2;
      }

      while (!p.isEmpty()) {
        resto = p.pop();
        System.out.print(resto);
      }
      System.out.println("\nFim do programa");
    } catch (Exception ex) {
      System.err.println("Deu ruim...");
      System.err.println(ex.getMessage());
    }
  }
}