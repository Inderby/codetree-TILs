#include <stdio.h>

int main() {
    // Please write your code here.
    double d;
    scanf("%lf", &d);

    if(d >= 1.0){
        printf("High");
    }else if(d >= 0.5){
        printf("Middle");
    }else{
        printf("Low");
    }
    return 0;
}