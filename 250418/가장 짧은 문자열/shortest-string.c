#include <stdio.h>
#include <math.h>
#include <string.h>
int main() {
    // Please write your code here.
    char s1[21], s2[21], s3[21];
    scanf("%s %s %s",s1 ,s2, s3);
    int min = strlen(s1) > strlen(s2)? strlen(s2) : strlen(s1);
    min = min > strlen(s3) ? strlen(s3) : min;
    int max = strlen(s1) < strlen(s2)? strlen(s2) : strlen(s1);
    max = max < strlen(s3) ? strlen(s3) : max;
    printf("%d", max - min);
    return 0;
}