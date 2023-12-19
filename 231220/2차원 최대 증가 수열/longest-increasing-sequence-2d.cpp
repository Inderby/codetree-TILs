#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);
  // freopen("input.txt", "r", stdin);
  // freopen("output.txt", "w", stdout);
  int n, m;
  cin >> n >> m;
  vector<vector<short>> grid(n, vector<short>(m, 0));
  vector<vector<short>> dp(n, vector<short>(m, 0));

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cin >> grid[i][j];
    }
  }
  for (int i = 0; i < n; i++) {
    dp[i][0] = 1;
  }
  for (int i = 0; i < n; i++) {
    dp[0][i] = 1;
  }

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      for (int k = i + 1; k < n; k++) {
        for (int o = j + 1; o < m; o++) {
          if (grid[k][o] <= grid[i][j])
            continue;
          dp[k][o] = max(dp[i][j] + 1, dp[k][o]);
        }
      }
    }
  }
  int result = 0;
  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      result = max(dp[i][j], result);
    }
  }
  cout << result;
}