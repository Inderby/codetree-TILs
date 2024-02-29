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
	static int n, k;
	static int[] weight, value, dp; 
	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		weight = new int[n + 1];
		value = new int[n + 1];
		dp = new int[k + 1];
		Arrays.fill(dp, -1);
		for(int i = 1; i <=n; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
			if(weight[i] <= n) {
				dp[weight[i]] = value[i];	
			}
		}
		dp[0] = 0;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= n; j++) {
				if(i - weight[j] >= 0 && dp[i - weight[j]] != -1) {
					dp[i] = Math.max(dp[i], dp[i - weight[j]] + value[j]);
				}
			}
		}
		int ans = 0;
		for(int i = 0; i <= k; i++) {
			ans = Math.max(ans, dp[i]);
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