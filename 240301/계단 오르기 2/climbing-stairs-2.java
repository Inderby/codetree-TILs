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

	static void input() throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		dp = new int[n + 1][3];
		for (int i = 0; i <= n; i++) {
			Arrays.fill(dp[i], Integer.MIN_VALUE);
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0][0] = 0;
	}

	static void solve() throws Exception {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < 3; j++) {
				if (j - 1 >= 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + arr[i]);
				}

				if (i - 2 >= 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 2][j] + arr[i]);
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			ans = Math.max(ans, dp[n-1][i]);
		}
		for (int i = 0; i < 3; i++) {
			ans = Math.max(ans, dp[n][i]);
		}
		System.out.println(ans);
	}

	public static void main(String[] args) throws Exception {
	
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}