#include <stdio.h>
#include <string.h>

int main() {
    // Please write your code here.
    char n[1001];
    char m[1001];
    scanf("%s", n);
    scanf("%s", m);
    for(int i = 0; i <= strlen(n) - strlen(m); i++){
        int ext = 1;
        for(int j = 0; j < strlen(m); j++){
            if(n[i + j] != m[j]){
                ext = 0;
                break;
            }
        }
        if(ext){
            printf("%d", i);
            return 0;
        }
    }
    printf("-1");
    
    return 0;
}