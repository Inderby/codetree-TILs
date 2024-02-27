import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Pair{
		public int x, y;
		Pair() {};
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
		
	}
	static BufferedReader br;
	static BufferedWriter bw;
	static StringTokenizer st;
	
	static int n;
	static Pair[] arr;
	static int[] dp;
	static void input() throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new Pair[n];
		dp = new int[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i] = new Pair(x, y);
			dp[i] = 1;
		}
	}

	static void solve() throws Exception {
		Arrays.sort(arr, Comparator.<Pair, Integer>comparing(a -> a.x).thenComparing(a->a.y));
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				if(arr[i].y < arr[j].x) {
					dp[j]++;
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < n; i++) {
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