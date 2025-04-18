#include <stdio.h>
#include <string.h>

int main() {
    // Please write your code here.
    char w1[21], w2[21];
    scanf("%s %s", w1, w2);
    if(strlen(w1) > strlen(w2)){
        printf("%s %d", w1, strlen(w1));
    }else if(strlen(w1) < strlen(w2)){
        printf("%s %d", w2, strlen(w2));
    }else{
        printf("same");
    }
    return 0;
}