#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

int main() {
    struct node *head = NULL;

    struct node *data1 = malloc(sizeof(struct node));
    struct node *data2 = malloc(sizeof(struct node));

    data1->data = 1;
    data2->data = 10;
    data1->next = data2;
    data2->next = NULL;

    head = data1;

    printf("Data 1: %d\n", head->data);
    printf("Data 2: %d\n", head->next->data);

    free(data2);
    free(data1);

    return 0;
}
