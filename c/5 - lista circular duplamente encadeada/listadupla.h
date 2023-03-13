struct CaixinhaDupla
{
  int elemento;
  struct CaixinhaDupla *anterior;
  struct CaixinhaDupla *proximo;
};

struct ListaDupla
{
  struct CaixinhaDupla *inicio;
};

void create(struct ListaDupla *lista);
int isEmpty(struct ListaDupla *lista);
void inserir(struct ListaDupla *lista, int elemento);
void exibirNaOrdem(struct ListaDupla *lista);
void exibirNaOrdemInversa(struct ListaDupla *lista);