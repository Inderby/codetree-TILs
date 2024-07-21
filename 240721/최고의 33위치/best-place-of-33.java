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
	static int gridSize = 3;
	static int[][] arr;
	static int[][] sum;

	static void solve() throws Exception {
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		sum = new int[n - 2][n - 2];
		int max = 0;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i < n - 2; i++) {
			for(int j = 0; j < n - 2; j ++) {
				for(int k = 0; k < 3; k++) {
					for(int l = 0; l < 3; l++) {
						if(arr[i+k][j+l] == 1) {
							sum[i][j] += 1;
							max = Math.max(max, sum[i][j]);
						}
					}
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		solve();
	}

}