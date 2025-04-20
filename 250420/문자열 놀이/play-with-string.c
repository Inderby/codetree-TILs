#include <stdio.h>
int main() {
    // Please write your code here.
    char s[101];
    int q;
    scanf("%s %d", s, &q);
    for(int i = 0; i < q; i++){
        int c;
        scanf("%d", &c);
        if(c == 1){
            int a, b;
            scanf("%d %d", &a, &b);

            char x = s[a - 1], y = s[b - 1];
            s[b - 1] = x;
            s[a - 1] = y;
        }
        else if(c == 2){
            char x, y;
            scanf(" %c %c", &x, &y);
            for(int j = 0; s[j] != '\0'; j++){
                if(s[j] == x)
                    s[j] = y;
            }
        }
        printf("%s\n", s);
    }

    
    return 0;
}