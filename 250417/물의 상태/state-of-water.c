#include <stdio.h>

int main() {
    // Please write your code here.
    int temp;
    scanf("%d", &temp);
    if(temp < 0){
        printf("ice");
    }else if(temp >= 100){
        printf("vapor");
    }else{
        printf("water");
    }
    return 0;
}