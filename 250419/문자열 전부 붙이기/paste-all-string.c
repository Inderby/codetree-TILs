#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    char arr[10][101];
    char ans[1001];
    int n;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", arr[i]);
        strcat(ans, arr[i]);
    }
    printf("%s", ans);
    
    return 0;
}