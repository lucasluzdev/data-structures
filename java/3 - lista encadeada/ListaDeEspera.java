public class ListaDeEspera {
  public static void main(String args[]) {
    Lista lista = new Lista();
    StringBuilder str = new StringBuilder();
    lista.inserir(1);
    lista.inserir(872);
    lista.inserir(123);
    lista.inserir(1597);
    lista.inserir(2);

    while (!lista.isEmpty()) {
      int e = lista.retirar();
      str.append(String.valueOf(e) + " ");
    }
    System.out.println("Retirei o elemento: " + str.toString());
  }
}
