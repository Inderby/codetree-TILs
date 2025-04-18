#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char * arr[10];
    int length = 0;
    for(int i = 0; i < 10; i++){
        scanf("%s", arr[i]);
        length += strlen(arr[i]);
    }

    printf("%d", length);
    return 0;
}