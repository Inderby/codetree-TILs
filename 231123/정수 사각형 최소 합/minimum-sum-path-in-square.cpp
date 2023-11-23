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
  dp[0][n-1] = arr[0][n-1];
  for(int i = n-2; i >= 0; i--){
    dp[0][i] = dp[0][i+1] + arr[0][i];
    dp[n - 1 - i][n-1] = dp[n - 2 -i][n-1] + arr[n - 1 - i][n-1];
  }
  for(int i = 1; i < n; i++){
    for(int j = n - 2; j >= 0; j--){
      dp[i][j] = min(dp[i-1][j], dp[i][j+1]) + arr[i][j];
    }
  }

  cout << dp[n-1][0];
}