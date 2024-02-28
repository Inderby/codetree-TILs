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
	static int[] weight, dp, value;
	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		weight = new int[n + 1];
		value = new int[n + 1];
		dp = new int[m + 1];
		Arrays.fill(dp, -1);
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			value[i] = Integer.parseInt(st.nextToken());
			if(weight[i] <= m) {
				dp[weight[i]] = value[i];
			}
		}
		dp[0] = 0;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= n; i++) {
			for(int j = m; j >= 0; j--) {
				if(j - weight[i] >= 0 && dp[j - weight[i]] != -1) {
					dp[j] = Math.max(dp[j] , dp[j - weight[i]] + value[i]); 
				}
			}
		}
		
		if(dp[m] == -1) {
			System.out.println(0);
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