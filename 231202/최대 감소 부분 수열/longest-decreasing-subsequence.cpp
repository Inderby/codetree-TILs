#include <bits/stdc++.h>
using namespace std;
int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);
  freopen("input.txt", "r", stdin);
  freopen("output.txt", "w", stdout);

  int n;
  cin >> n;
  vector<int> arr = vector<int>(n+1, 0);
  int max_num = 0;
  for(int i = 1; i <= n; i++){
    cin >> arr[i];
    max_num = max(max_num, arr[i]);
  }
  vector<int> dp = vector<int>(max_num+1, -1);

  dp[max_num] = 0;

  for(int i = 1; i <= n; i++){
    int  j = arr[i];

    for(int l = max_num; l > arr[i]; l--){
      if(dp[l] != -1){
        dp[j] = max(dp[l]+1, dp[j]);
      }
    }
  }
  int result = 0;
  for(int i = 0; i <= max_num; i++){
    result = max(result, dp[i]);
  }

  cout << result+1;
}