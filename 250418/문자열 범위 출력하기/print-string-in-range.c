#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str[101];
    fgets(str, 101, stdin);
    for(int i = 2; i < 10; i++){
        printf("%c", str[i]);
    }

    return 0;
}