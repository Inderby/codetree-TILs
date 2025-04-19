#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char arr[10][21];
    for(int i = 0; i < 10; i++){
        scanf("%s", arr[i]);
    }

    char c;
    scanf(" %c", &c);
    int count = 0;
    for(int i = 0; i < 10; i++){
        if(arr[i][strlen(arr[i]) - 1] == c){
            printf("%s\n", arr[i]);
            count++;
        }
    }
    if(count == 0){
        printf("None");
    }
    return 0;
}