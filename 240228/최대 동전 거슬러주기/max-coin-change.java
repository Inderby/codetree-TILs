import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	static int n, m;
	static int[] arr, dp;

	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		dp = new int[m + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
//			dp[arr[i]] = 1;
		}

	}

	static void solve() throws Exception {
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if(i - arr[j] >= 0) {
					dp[i] = Math.max(dp[i], dp[i - arr[j]] + 1);
				}
			}
		}
		if(dp[m] == 0) {
			System.out.println(-1);
		}else {
			System.out.println(dp[m]);
		}
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}