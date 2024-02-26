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
	static int r, c;
	static int maxSize;
	static int[][] arr;

	static void input() throws Exception {
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		arr = new int[r][c];
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < c; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
	}

	static void solve() throws Exception {
		int ans = -1;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				for(int k = i; k < r; k++) {
					for(int l = j; l < c; l++) {
						if(valid(i,j,k,l)) {
							ans = Math.max(ans, (k - i + 1) * (l - j + 1));
						}
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static boolean valid(int x1, int y1, int x2, int y2) {
		for(int i = x1; i <= x2; i++) {
			for(int j = y1; j <= y2; j++) {
				if(arr[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}