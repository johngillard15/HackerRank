#include <iostream>
#include <cstdio>
#include <cmath>
using namespace std;

int max_of_four(int a, int b, int c, int d){ 
    // using if statement
    // int max;
    // if (a > b && a > c && a > d)
    //     ans = a;
    // else if (b > c && b > d)
    //     ans = b;
    // else if (c > d)
    //     ans = c;
    // else
    //     ans = d;
    // return ans;
    
    // using Math.max
    return max(max(a, b), max(c, d));
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
