#include "pilha.h"
#include <stdlib.h>

void create(struct Pilha *pilha)
{
  pilha->topo = NULL;
}

void push(struct Pilha *pilha, int elemento)
{
  struct Caixinha *novo = (struct Caixinha *)malloc(sizeof(struct Caixinha));
  novo->elemento = elemento;
  novo->proximo = pilha->topo;

  pilha->topo = novo;
}

int pop(struct Pilha *pilha)
{
  int elemento;
  struct Caixinha *topoAtual = pilha->topo;
  pilha->topo = topoAtual->proximo;

  elemento = topoAtual->elemento;
  free(topoAtual);
  return elemento;
}

int isEmpty(struct Pilha pilha)
{
  return (pilha.topo == NULL);
}