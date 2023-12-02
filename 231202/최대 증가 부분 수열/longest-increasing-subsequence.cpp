#include <iostream>
#include <climits>
#include <algorithm>

#define MAX_NUM 1000
#define MAX_VALUE 10000
#define INVALID INT_MIN

using namespace std;

// dp[i][j] :
// i 번째 원소까지 고려했고
// 마지막으로 고른 원소의 값이 j일 때의
// 최장 부분 수열의 길이
int dp[MAX_NUM + 1][MAX_VALUE + 1];
int n;
int a[MAX_NUM + 1];

void Initialize() {
    // 최대를 구하는 문제이므로, 
    // 초기에는 전부 INT_MIN을 넣어줍니다.
    for(int i = 0; i <= n; i++)
        for(int j = 0; j <= MAX_VALUE; j++)
            dp[i][j] = INT_MIN;
    
    // 0번째 원소에 0이라는 숫자로 항상 부분 수열을 만들되
    // 이때까지의 부분 수열의 길이는 0이었기 때문에, 
    // 각각의 위치에 있는 원소를 시작으로 하는 
    // 모든 부분 수열을 만들 수 있게 해줍니다.
    dp[0][0] = 0;
}

int main() {
    cin >> n;
    for(int i = 1; i <= n; i++)
        cin >> a[i];

    Initialize();

    for(int i = 1; i <= n; i++){
        for(int j = 0; j <= MAX_VALUE; j++) {
            // j와 현재 위치에 있는 숫자 a[i]가 다르다면
            // i - 1번째 중에 최장 부분 수열이 있는 경우만 생각합니다.
            if(j != a[i])
                dp[i][j] = dp[i - 1][j];
            
            // j값이 현재 위치에 있는 숫자 a[i]와 일치한다면
            // 2가지 경우를 다 고려하여
            // 그 중 가장 좋은 값을 택해야 합니다.
            else {
                // Case 1 : i - 1번째 중에 최장 부분 수열이 있는 경우
                dp[i][j] = dp[i - 1][j];

                // Case 2 : a[i]를 최장 부분 수열에 이용한 경우
                // 증가 부분 수열이 되어야 하므로
                // a[i]보다 작은 부분까지만 탐색하여
                // a[i]라는 원소를 하나 더 추가했을 때의 
                // 부분 수열 길이 중 최댓값을 갱신합니다.
                for(int l = 0; l < a[i]; l++)
                    if(dp[i - 1][l] != INVALID)
                        dp[i][j] = max(dp[i][j], 
                                       dp[i - 1][l] + 1);
            }
        }
    }

    // n개의 원소를 다 고려했을 때,
    // 마지막으로 끝나는 숫자가 j일때의 부분 수열들 중
    // 가장 길이가 긴 부분 수열을 고릅니다.
    int answer = 0;
    for(int j = 0; j <= MAX_VALUE; j++)
        answer = max(answer, dp[n][j]);

    cout << answer;
}