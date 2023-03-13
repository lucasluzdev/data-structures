struct Fila
{
  int inicio;
  int fim;
  int total;
  int valores[10];
};

void create(struct Fila *f);
void insert(struct Fila *f, int elemento);
int retirar(struct Fila *f);
int isEmpty(struct Fila f);
int isFull(struct Fila f);