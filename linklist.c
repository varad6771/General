#include <stdio.h>

struct node {
	int data;
	struct node *link;
};

void addnode(struct node **, int data);
void addatbeg(struct node **, int data);
void display(struct node *);
void search(struct node *, int val);

void addnode(struct node **q, int data) {
	struct node *temp, *r;
	if (*q == NULL){
		temp = malloc(sizeof(struct node));
		temp -> data = data;
		temp -> link = NULL;
		*q = temp;
	} else {
		temp = *q;
		while(temp->link !=NULL){
			temp = temp->link;
		}
		r = malloc(sizeof(struct node));
		r->data = data;
		r->link = NULL;
		temp->link = r;

	}
}

void addatbeg(struct node **q, int data){
	struct node *temp;
	temp = malloc(sizeof(struct node));
	temp->data = data;
	temp->link = *q;
	*q = temp;
}

void display(struct node *q){
	while(q != NULL){
		printf("%d\n", q->data );
		q = q->link;
	}
}

void search(struct node *q, int val){
	while (q!=NULL){
		if (q->data == val){
			printf("value found\n");
			break;
		} else {
			printf("value not found\n" );
			break;
		}
		q = q->link;
	}
}

int main(int argc, char const *argv[]){

	struct node *p;
	p = NULL;

	addatbeg(&p, 13);
	addnode(&p, 14);
	addnode(&p, 15);
	addnode(&p, 16);
	addnode(&p, 17);

	display(p);
	search(p, 1);
	search(p, 13);

	return 0;
}