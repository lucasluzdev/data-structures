public class Arvore {
  private Elemento elem;
  private Arvore dir;
  private Arvore esq;

  public Arvore() {
    this.elem = null;
    this.dir = null;
    this.esq = null;
  }

  public Arvore(Elemento elem) {
    this.elem = elem;
    this.dir = null;
    this.esq = null;
    // System.out.println("Arvore criada com o elemento " + elem.getValor());
  }

  // metodos de controle
  public boolean isEmpty() {
    return (this.elem == null);
  }

  public void inserir(Elemento novo) {
    if (isEmpty()) {
      this.elem = novo;
    }
    else {
      Arvore novaArvore = new Arvore(novo);
      if (novo.getValor() < this.elem.getValor()) { // vou inserir na descendencia esquerda
        if (this.esq == null) { // e um nó folha?
          this.esq = novaArvore;
          // System.out.println("Inseri o elemento "+novo.getValor()+" à esquerda de " + this.elem.getValor());
        }
        else {
          this.esq.inserir(novo);
        }
      }
      else if (novo.getValor() > this.elem.getValor()) { // vou insedir na descendencia direita
        if (this.dir == null) {
          this.dir = novaArvore;
          // System.out.println("Inseri o elemento "+novo.getValor()+" à direita de " + this.elem.getValor());
        }
        else {
          this.dir.inserir(novo);
        }
      }
    }
  }

  public boolean busca(int valor) {
    if (this.isEmpty()) {
      return false;
    }
    if (this.elem.getValor() == valor) {
      return true;
    }
    else {
      if (valor < this.elem.getValor()) {
        if (this.esq == null) {
          return false;
        }
        else {
          return this.esq.busca(valor); // repassei a responsa para a sub arvore esquerda
        }
      }
      else if (valor > this.elem.getValor()) {
        if (this.dir == null) {
          return false;
        }
        else {
          return this.dir.busca(valor);
        }
      }
      return false;
    }
  }

  public void imprimirPreOrdem() {
    if (!this.isEmpty()) {
      System.out.print(this.elem.getValor() + " ");
      if (this.esq != null) {
        this.esq.imprimirPreOrdem();
      }
      if (this.dir != null) {
        this.dir.imprimirPreOrdem();
      }
    }
  }

  public void imprimirInOrdem() {
    if (!this.isEmpty()) {
      if (this.esq != null) {
        this.esq.imprimirInOrdem();
      }
      System.out.print(this.elem.getValor() + " ");
      if (this.dir != null) {
        this.dir.imprimirInOrdem();
      }
    }
  }

  public void imprimirPosOrdem() {
    if (!this.isEmpty()) {
      if (this.dir != null) {
        this.dir.imprimirPosOrdem();
      }
      if (this.esq != null) {
        this.esq.imprimirPosOrdem();
      }
      System.out.print(this.elem.getValor() + " ");
    }
  }

  public void setElem(Elemento elem) {
    this.elem = elem;
  }

  public void setDir(Arvore dir) {
    this.dir = dir;
  }

  public void setEsq(Arvore esq) {
    this.esq = esq;
  }

  public Elemento getElem() {
    return this.elem;
  }

  public Arvore getDir() {
    return this.dir;
  }

  public Arvore getEsq() {
    return this.esq;
  }

}