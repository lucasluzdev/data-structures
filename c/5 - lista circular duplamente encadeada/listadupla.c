#include "listadupla.h"
#include <stdio.h>
#include <stdlib.h>

void create(struct ListaDupla *lista)
{
  lista->inicio = NULL;
}

int isEmpty(struct ListaDupla *lista)
{
  return (lista->inicio == NULL);
}

void inserir(struct ListaDupla *lista, int elemento)
{
  struct CaixinhaDupla *novo = (struct CaixinhaDupla *)malloc(sizeof(struct CaixinhaDupla));
  novo->elemento = elemento;

  if (lista->inicio == NULL)
  {
    novo->proximo = novo;
    novo->anterior = novo;
    lista->inicio = novo;
  }
  else
  {
    struct CaixinhaDupla *tmp = lista->inicio;
    while (tmp->proximo != lista->inicio)
    {
      tmp = tmp->proximo;
    }
    novo->proximo = lista->inicio;
    novo->anterior = tmp;
    tmp->proximo = novo;
    lista->inicio->anterior = novo;
  }
}

void exibirNaOrdem(struct ListaDupla *lista)
{
  struct CaixinhaDupla *tmp = lista->inicio;
  do
  {
    printf("Elemento da lista = %d\n", tmp->elemento);
    tmp = tmp->proximo;
  } while (tmp != lista->inicio);
}

void exibirNaOrdemInversa(struct ListaDupla *lista)
{
  struct CaixinhaDupla *tmp = lista->inicio;
  do
  {
    printf("Elemento da lista = %d\n", tmp->elemento);
    tmp = tmp->anterior;
  } while (tmp != lista->inicio);
}