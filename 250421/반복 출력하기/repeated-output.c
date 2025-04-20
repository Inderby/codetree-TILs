#include <stdio.h>

void func(int row_num){
    for(int i = 0; i < row_num; i++){
        printf("12345^&*()_\n");
    }
}

int main() {
    int row_num;
    scanf("%d", &row_num);
    // Please write your code here.
    func(row_num);
    return 0;
}