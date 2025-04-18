#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char arr[10][201];
    for(int i = 0; i < 10; i++){
        fgets(arr[i], 201, stdin);
        for(int j = 0; j < strlen(arr[i]); j++){
            if(arr[i][j] == ' ') 
                arr[i][j] = '\n';
        }

    }

    for(int i = 0; i < 10; i++){
        printf("%s", arr[i]);
    }
    return 0;
}