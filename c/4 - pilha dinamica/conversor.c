#include <stdio.h>
#include "pilhaDinamica.c"

int main(int argc, char *argv[])
{

  int valor, resto;
  struct Pilha p;
  create(&p);

  printf("Digite um valor ai velhinho:");
  scanf("%d", &valor);

  while (valor != 0)
  {
    resto = valor % 2;
    push(&p, resto);
    valor = valor / 2;
  }

  while (!isEmpty(p))
  {
    resto = pop(&p);
    printf("%d", resto);
  }
  printf("\n\nfim do programa.");

  return 0;
}