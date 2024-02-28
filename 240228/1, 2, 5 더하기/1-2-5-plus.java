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
	static int n;
	static int[] dp;
	static void input() throws Exception {
		n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		dp[0] = 1;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= n; i++) {
			if(i - 1 >= 0) {
				dp[i] += dp[i - 1];
				
			}
			if(i - 2 >= 0) {
				dp[i] += dp[i - 2];
			}
			
			if(i - 5 >= 0) {
				dp[i] += dp[i - 5];
			}
			
			dp[i] %= 10007;
		}
		System.out.println(dp[n]);
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}