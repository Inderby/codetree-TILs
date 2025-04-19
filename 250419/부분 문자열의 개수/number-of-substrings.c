#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s[21];
    scanf("%s", s);
    char s1[3];

    scanf("%s", s1);
    int count1 = 0;
    for(int i = 0; i <= strlen(s) - 2; i++){
        int f1 = 1, f2 = 1;
        for(int j = 0; j < 2; j++){
            if(s[i + j] != s1[j]){
                f1 = 0;
            }
        }

        if(f1)
            count1++;
    }
    printf("%d", count1);
    return 0;
}