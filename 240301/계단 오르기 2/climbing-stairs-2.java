import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	static int n;
	static int[] arr;
	static int[][] dp;
	static int INF = Integer.MIN_VALUE;
	static void input() throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		dp = new int[n + 1][4];
//		for (int i = 0; i <= n; i++) {
//			Arrays.fill(dp[i], -1);
//		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0][0] = 0;
	}

	static void solve() throws Exception {
		dp[1][0] = -INF;
        dp[1][1] = arr[1];
        dp[1][2] = -INF;
        dp[1][3] = -INF;

        dp[2][0] = arr[2];
        dp[2][1] = -INF;
        dp[2][2] = arr[1] + arr[2];
        dp[2][3] = -INF;

        // 동적 프로그래밍을 사용하여 최대 가치를 계산합니다.
        // dp[i][j] : i번 위치에 도착했을 때, 정확히 j번 1계단 올랐을 때의 최대 가치
        for (int i = 3; i <= n; i++) {
            for (int j = 0; j <= 3; j++) {
                dp[i][j] = Math.max(dp[i][j], dp[i - 2][j] + arr[i]);
                if (j > 0) dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + arr[i]);
            }
        }
     // 가능한 모든 경우에서 최대 가치를 찾아 출력합니다.
        for(int[] i : dp) {
        	for(int j : i) {
        		System.out.print(j + " ");
        	}
        	System.out.println();
        }
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}