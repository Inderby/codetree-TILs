#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);
  // freopen("input.txt", "r", stdin);
  // freopen("output.txt", "w", stdout);

  int n;
  cin >> n;
  vector<int> arr(n, 0);
  vector<int> dp(n, 0);
  for (int i = 0; i < n; i++) {
    cin >> arr[i];
  }

  for (int i = 0; i < n; i++) {
    for (int j = 1; j <= arr[i]; j++) {
      if (i + j >= n)
        break;
      if (dp[i] == 0 && i != 0)
        break;
      dp[i + j] = max(dp[i] + 1, dp[i + j]);
    }
  }

  int result = 0;
  for (int i = 0; i < n; i++) {
    result = max(dp[i], result);
  }

  cout << result;
}