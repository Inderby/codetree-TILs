#include <stdio.h>

int main() {
    // Please write your code here.
    char s1[21], s2[21];
    scanf("%s %s", s1, s2);
    for(int i = 0; i < 2; i++){
        s2[i] = s1[i];
    }
    printf("%s", s2);
    return 0;
}