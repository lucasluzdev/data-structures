struct Caixinha
{
  int elemento;
  struct Caixinha *proximo;
};

struct Pilha
{
  struct Caixinha *topo;
};

void create(struct Pilha *pilha);
void push(struct Pilha *pilha, int elemento);
int pop(struct Pilha *pilha);
int isEmpty(struct Pilha pilha);