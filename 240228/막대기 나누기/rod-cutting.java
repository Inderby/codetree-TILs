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
	static int[] dp;
	
 	static void input() throws Exception {
 		n = Integer.parseInt(br.readLine());
 		arr = new int[n+1];
 		dp = new int[n+1];
 		Arrays.fill(dp, -1);
 		st = new StringTokenizer(br.readLine());
 		for(int i = 1; i <=n; i++) {
 			arr[i] = Integer.parseInt(st.nextToken());
 		}
 		dp[0] = 0;
	}

	static void solve() throws Exception {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i - j >= 0 && dp[i - j] != -1) {
					dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
				}
			}
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