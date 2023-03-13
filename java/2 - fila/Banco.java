public class Banco {
  public static void main(String args[]) {
    Fila f;
    int e;
    f = new Fila();

    f.insert(176);
    f.insert(914);
    f.insert(12);
    f.insert(1817);
    f.insert(100);

    System.out.println("Bem vindos ao banco Izibank! Servimos bem, para servirmos sempre!");
    System.out.println("Atendimento-------------");

    while (!f.isEmpty()) {
      e = f.remove();
      System.out.println("Senha a ser atendida no guiche: " + e);
    }
  }
}