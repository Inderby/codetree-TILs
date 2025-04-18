#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {
    // Please write your code here.
    char **arr;
    int n, length = 0, a = 0;
    scanf("%d", &n);
    arr = (char **) malloc(sizeof(char *) * n);
    for(int i = 0; i < n; i++){
        arr[i] = (char*) malloc(sizeof(char) * 101);
        scanf("%s", arr[i]);
        if(arr[i][0] == 'a')
            a++;
        length += strlen(arr[i]);
    }
    printf("%d %d", length, a);

    return 0;
}