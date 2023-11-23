#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);
  int n;
  cin >> n;
  vector<int> dp = vector<int>(n+1, 0);
  dp[1] = 1;
  dp[2] = 2;
  dp[3] = 5;
  for(int i = 4; i <= n; i++){
    dp[i] = dp[i-1] * 2 + dp[i-2] * 2;
  }
  cout << dp[n];
}