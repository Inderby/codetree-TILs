#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char str[21];
    char s1[3] = "ee";
    char s2[3] = "ab";
    scanf("%s", str);
    int flag1 = 0, flag2 = 0;
    for(int i = 0; i < strlen(str); i++){
        int exist1 = 1;
        int exist2 = 1;
        for(int j = 0; j < 2; j++){
            if(str[i + j] != s1[j]) {
                exist1 = 0;
            }

            if(str[i + j] != s2[j]) {
                exist2 = 0;
            }
        }
        if(exist1)
            flag1 = 1;

        if(exist2)
            flag2 = 1;
    }

    if(flag1)
        printf("Yes ");
    else
        printf("No ");


    if(flag2)
        printf("Yes");
    else
        printf("No");
    return 0;
}