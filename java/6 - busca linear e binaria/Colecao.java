public class Colecao {
  private int[] valores = { 11, 12, 23, 27, 33, 43, 56, 76, 87, 96 };

  public int buscaSequencial(int val) {

    for (int pos = 0; pos < valores.length; pos++) {
      if (val == valores[pos]) {
        return pos;
      }
    }
    return -1;
  }

  public int buscaBinaria(int val) {
    int meio = 0, inicio = 0, fim = valores.length - 1;

    while (inicio <= fim) {
      meio = ((inicio + fim) / 2);
      if (val == valores[meio]) {
        return meio;
      } else {
        if (val > valores[meio]) {
          inicio = meio + 1;
        } else {
          fim = meio - 1;
        }
      }
    }
    return -1;
  }
}