struct Pilha
{
  int topo;
  int valores[10];
};

void create(struct Pilha *p);
void push(struct Pilha *p, int elemento);
int pop(struct Pilha *p);
int isEmpty(struct Pilha p);
int isFull(struct Pilha p);