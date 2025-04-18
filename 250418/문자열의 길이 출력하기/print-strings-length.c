#include <stdio.h>
#include <string.h>

int main() {
    // Please write your code here.
    char s1[101], s2[101];
    scanf("%s %s", s1, s2);
    printf("%d", strlen(s1) + strlen(s2));
    return 0;
}