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
	static int[] arr, dp;
	static int sum;

	static void input() throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		dp = new int[n * 1000 + 1];
		Arrays.fill(dp, -1);
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		dp[0] = 0;
	}

	static void solve() throws Exception {
		for (int i = 1; i <= n; i++) {
			for (int j = n * 1000; j >= 0; j--) {
				if (j - arr[i] >= 0 && dp[j - arr[i]] != -1) {
					dp[j] = 1;
				}
			}
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] != -1) {
				ans = Math.min(ans, Math.abs(sum - i * 2));
			}
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