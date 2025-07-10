#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

void insert(int num, struct node *head) {
    struct node *current = head;
    while (current->next != NULL) {
        current = current->next;
    }

    // current is now the last node
    struct node *new = malloc(sizeof(struct node));
    new->data = num;
    new->next = NULL;
    current->next = new;

    printf("Inserted: %d at %p\n", new->data, new);
}



int main(){
    struct node *head=malloc(sizeof(struct node));
    head->data=1;
    struct node *ptr1 =malloc(sizeof(struct node));
    head->next=ptr1;
    ptr1->data=5;
    ptr1->next=NULL;
    insert(10,head);
    printf("%d",head->data);
    return 0;
}