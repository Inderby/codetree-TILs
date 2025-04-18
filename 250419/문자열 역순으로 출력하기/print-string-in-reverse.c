#include <stdio.h>

int main() {
    // Please write your code here.
    char lists[4][21];
    for(int i = 0; i < 4; i++){
        scanf("%s", lists[i]);
    }

    for(int i = 4 - 1; i >= 0 ;i--){
        printf("%s\n", lists[i]);
    }
    return 0;
}