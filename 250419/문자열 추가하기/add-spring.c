#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str[27];
    char *s = "Hello";
    scanf("%s", str);
    strcat(str, s);
    printf("%s", str);
    return 0;
}