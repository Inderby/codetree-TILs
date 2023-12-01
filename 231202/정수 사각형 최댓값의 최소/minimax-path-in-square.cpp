#include <bits/stdc++.h>
using namespace std;

int n;

int dx[2] = {0, 1};
int dy[2] = {1, 0};

vector<vector<int>> grid;
vector<vector<int>> dp;

int ps(int cx, int cy){
  if(dp[cx][cy]){
    return dp[cx][cy];
  }
  int min_num = 10000000;
  for(int i = 0; i < 2; i++){
    int nx = cx + dx[i];
    int ny = cy + dy[i];

    if(nx >= n || ny >= n)
      continue;
    min_num = min(max(grid[nx][ny], ps(nx, ny)),min_num);
  }
  return dp[cx][cy] = min_num;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  cout.tie(nullptr);

  cin >> n;
  grid = vector<vector<int>>(n, vector<int>(n));
  dp = vector<vector<int>>(n, vector<int>(n, 0));

  for(int i = 0; i < n; i++){
    for(int j = 0; j < n; j++){
      cin >> grid[i][j];
    }
  }
  dp[n-1][n-1] = grid[n-1][n-1];
  
  cout << ps(0, 0);
}