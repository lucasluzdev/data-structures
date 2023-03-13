#include <stdio.h>
#include "fila.c"

int main(int argc, char *argv[])
{

  struct Fila f;
  int elemento;
  create(&f);

  insert(&f, 913);
  insert(&f, 914);
  insert(&f, 915);
  insert(&f, 916);
  insert(&f, 917);
  insert(&f, 918);

  printf("Bem vindos ao isibank! Aqui seu dinheiro rende mais\n");
  printf("Atendimento ---------------------\n");

  while (!isEmpty(f))
  {
    elemento = retirar(&f);
    printf("Numero de senha a ser atendida: %d\n", elemento);
  }

  return 0;
}