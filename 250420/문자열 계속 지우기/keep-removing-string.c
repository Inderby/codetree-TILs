#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char a[101], b[101];
    scanf("%s %s", a, b);
    int len_a = strlen(a);
    int len_b = strlen(b);    
    int find = 0;
    do{
        find = 0;
        
        int i = 0;
        for(; i <= len_a - len_b; i++){
            int flag = 1;
            for(int j = 0; j < len_b; j++){
                if(a[i + j] != b[j]){
                    flag = 0;
                    break;
                }
            }

            if(flag){
                find = 1;
                int j = i;
                for(; j < len_a - len_b; j++){
                    a[j] = a[j + len_b];
                }

                len_a -= len_b;
                a[j] = '\0';
                i--;
            }
        }
        
    }while(find);

    printf("%s", a);
    return 0;
}