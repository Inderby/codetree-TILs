#include <stdio.h>

int main() {
    // Please write your code here.
    char strs[5][20] = {"apple", "banana", "grape", "blueberry", "orange"};
    char c;
    scanf("%c", &c);
    int count = 0;
    for(int i = 0; i < 5; i++){
        if(strs[i][3] == c || strs[i][2] == c){
            printf("%s\n", strs[i]);
            count++;
        }
    }
    printf("%d", count);
    return 0;
}