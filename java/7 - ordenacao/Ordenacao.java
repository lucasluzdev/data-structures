public class Ordenacao {
  private int[] vetor = { 25, 57, 48, 37, 12, 92, 33 };

  public void setVetor(int vetor[]) {
    this.vetor = vetor;
  }

  public int[] getVetor() {
    return this.vetor;
  }

  public void bubble() {
    int temp = 0, it = 0, pos = 0;

    for (it = 0; it < vetor.length - 1; it++) {
      for (pos = 0; pos < vetor.length - it - 1; pos++) {
        if (vetor[pos] > vetor[pos + 1]) {
          temp = vetor[pos];
          vetor[pos] = vetor[pos + 1];
          vetor[pos + 1] = temp;
        }
      }
    }
  }

  public void selection() {
    int it, temp, posMenorInicial, posMenor, i;

    for (it = 0; it < vetor.length - 1; it++) {
      posMenorInicial = it;
      posMenor = it + 1;

      for (i = posMenorInicial + 1; i < vetor.length; i++) {
        if (vetor[i] < vetor[posMenor]) {
          posMenor = i;
        }
      }
      if (vetor[posMenor] < vetor[posMenorInicial]) {
        temp = vetor[posMenorInicial];
        vetor[posMenorInicial] = vetor[posMenor];
        vetor[posMenor] = temp;
      }
    }
  }

  public void insertion() {
    int carta, i, j;
    for (i = 1; i < vetor.length; i++) {
      carta = vetor[i];
      for (j = i - 1; (j >= 0) && vetor[j] > carta; j--) {
        vetor[j + 1] = vetor[j];
      }
      vetor[j + 1] = carta;
    }
  }

  private int partition(int inicio, int fim) {
    int ref = vetor[inicio],
        up = fim,
        down = inicio,
        temp = 0;

    while (down < up) {
      // encontrando um numero maior que o pivo (ref)
      while (vetor[down] <= ref && down < fim) {
        down++; // avanço pq quero encontrar um valor maior
      }
      // agora eu tambem quero encontrar a partir do fim, um valor menor que o meu de
      // referencia
      while (vetor[up] > ref) {
        up--;
      }

      if (down < up) { // eles não se cruzaram nos indices
        // troca
        temp = vetor[down];
        vetor[down] = vetor[up];
        vetor[up] = temp;
      }
    }
    vetor[inicio] = vetor[up];
    vetor[up] = ref;

    return up; // no final das contas, e a posicao de up que denota onde esta o pivo
  }

  public void quick(int inicio, int fim) {
    int pivo;
    if (inicio > fim) {
      return;
    }

    pivo = partition(inicio, fim);
    quick(inicio, pivo - 1);
    quick(pivo + 1, fim);
  }

  public void mostrar() {
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetor[i] + " ");
    }
    System.out.println("");
  }
}