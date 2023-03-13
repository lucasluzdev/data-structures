#include "pilha.h"

void create(struct Pilha *p)
{
  p->topo = -1;
}

void push(struct Pilha *p, int elemento)
{
  p->topo++;
  p->valores[p->topo] = elemento;
}

int pop(struct Pilha *p)
{
  int elemento = p->valores[p->topo];
  p->topo--;
  return elemento;
}

int isEmpty(struct Pilha p)
{
  return (p.topo == -1);
}

int isFull(struct Pilha p)
{
  return (p.topo == 9);
}