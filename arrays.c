#include <stdio.h>
# define MAX 5
# define MAX1 3

void insert(int *, int, int);
void reverse(int *);
void display(int *, int);
void merge(int *, int*);	

void addmatrix(int *, int *);
void mulmatrix(int *);
void diagadd(int *);

void insert(int *arr, int pos, int val){
	int i;
	for (i = MAX; i>=pos; i--){
		arr[i] = arr[i-1];
	}
	arr[i] = val;
}

void reverse(int *arr){
	int revarr[5];
	int j = 5, i=0;;
	while(i<5 && j>0){
		revarr[i] = arr[j];
		i++;j--;
	}
	display(revarr, 5);
}

void display(int *arr, int lim){
	for (int i=0;i < lim; i++){
		printf("%d\t", arr[i]);
	}
}

void merge(int *arr1, int *arr2){
	int arr3[10];
	int j = 5, i = 0;

	for (int i = 0; i <5; ++i){
		arr3[i] = arr1[i];
	}
	while(j < 10 && i < 5){
		arr3[j] = arr2[i];
		j++;i++;
	}

	display(arr3, 10);
}

void addmatrix(int *arr1, int *arr2){
	int i,j;
	for (i = 0; i < MAX1; ++i){
		for (j = 0; j < MAX1; ++j){
			arr1[i][j] += arr2[i][j];
		}
	}

	for (i = 0; i < MAX1; ++i){
		for (j = 0; j < MAX1; ++j){
			printf("%d\t",arr1[i][j]);
		}
		
	}
}

void diagadd(int *arr){
	
	
}

int main(){

	int arr[5];
	int arr1[5];

	insert(arr,1,1);
	insert(arr,2,2);
	insert(arr,3,3);
	// insert(arr,4,4);
	// insert(arr,5,5);
	// display(arr);
	// reverse(arr);
	insert(arr1,1,11);
	insert(arr1,2,12);
	insert(arr1,3,13);
	// insert(arr1,4,14);
	// insert(arr1,5,15);
	
	// merge(arr, arr1);
	addmatrix(arr,arr1);

	return 0;
}

