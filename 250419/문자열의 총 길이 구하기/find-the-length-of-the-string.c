#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main() {
    // Please write your code here.
    char * arr[201];
    int length = 0;
    for(int i = 0; i < 10; i++){
        arr[i] = (char *) malloc(sizeof(char) * 201);
        scanf("%s", arr[i]);
        length += strlen(arr[i]);
    }

    printf("%d", length);
    return 0;
}