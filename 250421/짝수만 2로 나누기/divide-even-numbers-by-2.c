#include <stdio.h>

int n;
int arr[50];

void func(int x[], int n){
    for(int i = 0; i < n; i++){
        if(x[i] % 2 == 0){
            x[i] /= 2;
        }
        printf("%d ", x[i]);
    }
}

int main() {
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    func(arr, n);
    return 0;
}