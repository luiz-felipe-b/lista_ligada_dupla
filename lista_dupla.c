#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int info;
    struct no * proximo;
    struct no * anterior;
} t_no;

typedef struct lista {
    t_no * primeiro;
    t_no * ultimo;
} t_lista;

t_no * constroi_no (int info) {
    t_no * no = (t_no *) malloc(sizeof(t_no)); //pois malloc devolve void*, um ponteiro genérico
    if (no != NULL){
        no->info = info;
        no->anterior = NULL;
        no->proximo = NULL;
    }
    return no;
}

void inicializa_lista (t_lista * lista) {
    lista->primeiro = NULL;
    lista->ultimo = NULL;
}

// int main() {
//     t_no * no1 = constroi_no(10);
//     printf("valor de no1: %p\n", no1);
//     printf("conteudo apontado por no1 no campo info: %d\n", no1->info);
//     printf("onde esta a variavel no1: %p\n", &no1);
//     printf("tamanho da variavel no1: %d\n", sizeof(no1));
//     printf("conteudo apontado por no1: %d\n", sizeof(*no1));
//     return 0;
// }

int main() {
    t_lista lista;
    printf("primeiro antes: %p\n", lista.primeiro);
    printf("ultimo antes: %p\n", lista.ultimo);
    inicializa_lista(&lista);
    printf("primeiro depois: %p\n", lista.primeiro);
    printf("ultimo depois: %p\n", lista.ultimo);
    return 0;
}