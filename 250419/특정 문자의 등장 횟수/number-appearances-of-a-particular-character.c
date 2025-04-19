#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s[21];
    scanf("%s", s);
    char s1[3] = "ee";
    char s2[3] = "eb";
    int count1 = 0, count2 = 0;
    for(int i = 0; i <= strlen(s) - 2; i++){
        int f1 = 1, f2 = 1;
        for(int j = 0; j < 2; j++){
            if(s[i + j] != s1[j]){
                f1 = 0;
            }
        }

        for(int j = 0; j < 2; j++){
            if(s[i + j] != s2[j]){
                f2 = 0;
            }
        }

        if(f1)
            count1++;

        if(f2)
            count2++;
    }
    printf("%d %d", count1, count2);
    return 0;
}