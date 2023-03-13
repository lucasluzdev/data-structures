#include "listadupla.h"
#include <stdio.h>

int main(void)
{

  struct ListaDupl *lista;

  create(&lista);
  inserir(&lista, 83);
  inserir(&lista, 67);
  inserir(&lista, 14);
  inserir(&lista, 99);

  exibirNaOrdem(&lista);
  printf("\n\n\n");
  exibirNaOrdemInversa(&lista);

  return 0;
}