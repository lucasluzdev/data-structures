struct Caixinha
{
  int elemento;
  struct Caixinha *proximo;
};

struct Lista
{
  struct Caixinha *inicio;
};

void inserir(struct Lista *lista, int elemento);
int isEmpty(struct Lista lista);
int retirar(struct Lista *lista);
void listar(struct Lista lista);