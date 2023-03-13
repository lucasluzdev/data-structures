#include "lista.c"
#include <stdio.h>
#include <string.h>
#define ENOUGH ((CHAR_BIT * sizeof(int) - 1) / 3 + 2)

int main(int argc, char *argv[])
{
  struct Lista lista;
  char str[50];
  char auxStr[5];
  create(&lista);
  int e;

  inserir(&lista, 987);
  inserir(&lista, 525);
  inserir(&lista, 633);
  inserir(&lista, 152);
  inserir(&lista, 631);

  strcpy(str, "");

  while (!isEmpty(lista))
  {
    e = retirar(&lista);
    sprintf(auxStr, "%d", e);
    strcat(str, auxStr);
    strcat(str, "\n");
  }

  printf("Item removido da lista:\n", str);
  return 0;
}