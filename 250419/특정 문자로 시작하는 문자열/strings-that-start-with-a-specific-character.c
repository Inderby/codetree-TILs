#include <stdio.h>
#include <string.h>
int main() {
    // Please write your code here.
    int n, count = 0, length = 0;
    char arr[20][21];
    char c;
    scanf("%d", &n);
    for(int i = 0; i < n; i++){
        scanf("%s", arr[i]);
    }
    scanf(" %c", &c);

    for(int i = 0; i < n ; i++){
        if(arr[i][0] == c){
            length += strlen(arr[i]);
            count++;
        }
    }

    printf("%d %.2lf", count, (double)length / count);
    return 0;
}