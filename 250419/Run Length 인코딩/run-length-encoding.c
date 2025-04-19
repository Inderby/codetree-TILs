#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char a[1001];
    char ans[2001];
    scanf("%s", a);
    char c = a[0];
    int count = 1;
    int ansIdx = 0;
    for(int i = 1; i < strlen(a); i++){
        if(a[i] != c){
            ans[ansIdx++] = c;
            int mod = 1000;
            int flag = 0;
            while(mod){
                int digit = count / mod;
                if(digit != 0 || flag){
                    ans[ansIdx++] = '0' +  digit;
                    flag = 1;
                }
                count %= mod;
                mod /= 10;
            }

            count = 1;
            c = a[i];
        }else{
            count++;
        }
    }

    ans[ansIdx++] = c;
    int mod = 1000;
    int flag = 0;
    while(count){
        int digit = count / mod;
        if(digit != 0 || flag){
            ans[ansIdx++] = '0' +  digit;
            flag = 1;
        }
        count %= mod;
        mod /= 10;
    }
    ans[ansIdx] = '\0';
    printf("%d\n", strlen(ans));
    printf("%s", ans);
    return 0;
}