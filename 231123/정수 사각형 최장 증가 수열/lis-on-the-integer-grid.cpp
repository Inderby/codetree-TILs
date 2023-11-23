#include <bits/stdc++.h>
using namespace std;
vector<vector<int>> grid;
vector<vector<int>> dp;
int dx[4] = {0, 0, -1, 1};
int dy[4] = {1, -1, 0, 0};
int n;
int ps(int cx, int cy){
  if(dp[cx][cy])
    return dp[cx][cy];
  int max_num = 0;
  for(int i = 0; i < 4; i++){
    int nx = cx + dx[i];
    int ny = cy + dy[i];
    if(nx < 0 || nx >= n || ny < 0 || ny >=n) continue;
    if(grid[cx][cy] >= grid[nx][ny]) continue;
    max_num = max(ps(nx, ny), max_num);
  }
  dp[cx][cy] = max_num + 1;
  return max_num + 1;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);

  cin >> n;
  grid = vector<vector<int>>(n, vector<int>(n, 0));
  dp = vector<vector<int>>(n, vector<int>(n, 0));

  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      cin >> grid[i][j];
    }
  }
  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      ps(i, j);
    }
  }
  int max_num = 0;
  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      max_num = max(dp[i][j], max_num);
    }
  }
  cout << max_num;
}