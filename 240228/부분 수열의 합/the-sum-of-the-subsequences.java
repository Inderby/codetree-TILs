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
	static int[] arr, dp;
	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n + 1];
		dp = new int[m + 1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.fill(dp, Integer.MAX_VALUE - 1);
		dp[0] = 0;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= n; i++) {
			for(int j = m; j >= 0; j--) {
				if(j - arr[i] >= 0) {
					dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
				}
			}
		}
		
		if(dp[m] == Integer.MAX_VALUE - 1) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}