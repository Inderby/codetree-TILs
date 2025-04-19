#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    int n;
    char arr[10][5];
    char ans[52];
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", arr[i]);
        strcat(ans, arr[i]);
    }
    for(int i = 1; i < strlen(ans); i++){
        printf("%c", ans[i]);
        if(i % 5 == 0){
            printf("\n");
        }
    }
    return 0;
}