public class ListaDuplaCircular {
  private CaixinhaDupla inicio;

  public ListaDuplaCircular() {
    this.inicio = null;
  }

  public boolean isEmpty() {
    return (this.inicio == null);
  }

  public void inserir(int elemento) {
    CaixinhaDupla novo = new CaixinhaDupla();
    novo.setElemento(elemento);
    if (this.isEmpty()) {
      novo.setProximo(novo);
      novo.setAnterior(novo);
      this.inicio = novo;
    } else {
      CaixinhaDupla tmp = this.inicio;
      while (tmp.getProximo() != this.inicio) {
        tmp = tmp.getProximo();
      }
      inicio.setAnterior(novo);
      tmp.setProximo(novo);
      novo.setAnterior(tmp);
      novo.setProximo(this.inicio);
    }
  }

  public void exibirNaOrdem() {
    CaixinhaDupla tmp = this.inicio;

    do {
      System.out.println("Elemento da lista = " + tmp.getElemento());
      tmp = tmp.getProximo();
    } while (tmp != inicio);
  }

  public void exibirNaOrdemInversa() {
    CaixinhaDupla tmp = this.inicio;

    do {
      System.out.println("Elemento da lista = " + tmp.getElemento());
      tmp = tmp.getAnterior();
    } while (tmp != inicio);
  }
}