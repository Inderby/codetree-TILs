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
	static int n, m;
	static int[] exp, time, dp;
	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		exp = new int[n + 1];
		time = new int[n + 1];
		dp = new int[10001];
		Arrays.fill(dp, -1);
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			exp[i] = Integer.parseInt(st.nextToken());
			time[i] = Integer.parseInt(st.nextToken());
//			dp[time[i]] = exp[i];
		}
		
		dp[0] = 0;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= n; i++) {
			for(int j = 10000; j >= 0; j--) {
				if(j - time[i] >= 0 && dp[j - time[i]] != -1) {
					dp[j] = Math.max(dp[j], dp[j - time[i]] + exp[i]);
				}
			}
		}
		int ans = -1;
		for(int i = 0; i < dp.length; i++) {
			if(dp[i] >= m) {
				ans = i;
				break;
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