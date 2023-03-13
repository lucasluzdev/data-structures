public class MapaHash {
  private Registro valores[];

  public MapaHash() {
    valores = new Registro[100];
  }

  public void put(Registro registro) {
    int pos = registro.hashCode();
    if (valores[pos] == null) {
      valores[pos] = registro;
    } else {
      Registro reg = valores[pos];

      // epsecial para tratar o primeiro elemento
      if (reg.getKey() == registro.getKey()) { // o registro que quero inserir é o mesmo que ja existe?
        reg.setValue(registro.getValue()); // apenas substituo o valor
        return;
      }

      // se ele ta no meio da lista
      while (reg.getProximo() != null) {

        if (reg.getKey() == registro.getKey()) { // o registro que quero inserir é o mesmo que ja existe?
          reg.setValue(registro.getValue()); // apenas substituo o valor
          return;
        }
        reg = reg.getProximo();
      }

      // se ele é o ultimo da lista
      if (reg.getProximo() == null) {
        if (reg.getKey() == registro.getKey()) {
          reg.setValue(registro.getValue());
        }
      }
      reg.setProximo(registro); // coloquei o novo registro na ultima posicao
    }
  }

  public Registro get(int key) {

    Registro r = new Registro();
    r.setKey(key);
    int posicao = r.hashCode();
    Registro resultado = valores[posicao]; // tento encontrar o registro
    if (resultado != null && resultado.getKey() == key) { // é o que to procurando ?
      return resultado;
    } else {
      while (resultado != null) { // enquanto tiver itens na lista
        resultado = resultado.getProximo(); // vou pro proximo
        if (resultado != null && resultado.getKey() == key) { // é o item?
          return resultado; // se for, retorno ele
        }
      }
    }
    return null;
  }
}
