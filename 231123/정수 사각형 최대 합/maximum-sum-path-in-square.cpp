#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);
  int n;
  cin >> n;
  vector<vector<int>> arr = vector<vector<int>>(n, vector<int>(n, 0));
  vector<vector<int>> dp = vector<vector<int>>(n, vector<int>(n, 0));

  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      cin >> arr[i][j];
    }
  }
  dp[0][0] = arr[0][0];
  for(int i = 1; i < n; i++){
    dp[i][0] = dp[i-1][0] + arr[i][0];
    dp[0][i] = dp[0][i-1] + arr[0][i];
  }
  for(int i = 1; i < n; i++){
    for(int j = 1; j < n; j++){
      dp[i][j] = max(dp[i-1][j], dp[i][j-1]) + arr[i][j];
    }
  }
  cout << dp[n-1][n-1];
}