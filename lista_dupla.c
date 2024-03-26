#include <stdio.h>
#include <stdlib.h>

typedef struct no {
    int info;
    struct no * proximo;
    struct no * anterior;
} t_no;

t_no * constroi_no (int info) {
    t_no * no = (t_no *) malloc(sizeof(t_no)); //pois malloc devolve void*, um ponteiro genérico
    if (no != NULL){
        no->info = info;
        no->anterior = NULL;
        no->proximo = NULL;
    }
    return no;
}

int main() {
    t_no * no1 = constroi_no(10);
    printf("valor de no1: %p\n", no1);
    printf("conteudo apontado por no1 no campo info: %d\n", no1->info);
    printf("onde esta a variavel no1: %p\n", &no1);
    return 0;
}