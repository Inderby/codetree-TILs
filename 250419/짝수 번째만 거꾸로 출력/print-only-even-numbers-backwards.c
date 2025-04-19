#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str[101];
    char ans[101];
    scanf("%s", str);

    int len = strlen(str);
    if(len % 2 != 0){
        len--;
    }
    int ansIdx = 0;
    for(int i = len - 1; i >= 1; i -= 2){
        ans[ansIdx++] = str[i];
    }
    ans[ansIdx] ='\0';
    printf("%s", ans);
    return 0;
}