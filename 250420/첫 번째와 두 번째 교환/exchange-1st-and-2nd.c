#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s[21];
    scanf("%s", s);

    char f = s[0], b = s[1];
    for(int i = 0; i < strlen(s); i++){
        if(s[i] == f)
            s[i] = b;
        else if(s[i] == b)
            s[i] = f;
    }

    printf("%s", s);
    return 0;
}