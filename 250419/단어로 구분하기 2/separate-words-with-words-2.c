#include <stdio.h>

int main() {
    // Please write your code here.
    char arr[10][201];
    for(int i = 0; i < 10; i++){
        scanf("%s", arr[i]);
        if(i % 2 == 0){
            printf("%s\n", arr[i]);
        }
    }
    return 0;
}