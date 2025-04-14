#include <stdio.h>
#include <math.h>

double roundToN(double value, int n) {
    double multiplier = pow(10.0, n);
    return round(value * multiplier) / multiplier;
}

int main() {
    // Please write your code here.
    double d;
    scanf("%lf", &d);
    d = roundToN(d, 2);
    printf("%.2f", d);
    return 0;
}