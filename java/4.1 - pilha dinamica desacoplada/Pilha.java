public class Pilha implements IPilha {

  private int valores[];
  private int topo;

  public Pilha() {
    valores = new int[10];
    topo = -1;
  }

  public boolean isEmpty() {
    return (topo == -1);
  }

  public int pop() {
    int elemento = valores[topo];
    topo--;
    return elemento;
  }

  public void push(int elemento) {
    topo++;
    valores[topo] = elemento;
  }
}