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
	static int max;
	static int[][] arr;
	static int[][][] tile = {
			{
				{1, 1},
				{1, 0}
			},
			{
				{1, 1},
				{0, 1}
			},
			{
				{1, 0},
				{1, 1}
			},
			{
				{0, 1},
				{1, 1}
			}
	};
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
		for(int i = 0; i < r - 1; i++) {
			for(int j = 0; j < c - 1; j++) {
				
				for(int k = 0; k < 4; k++) {
					int val = 0;
					for(int l = 0; l < 2; l++) {
						for(int h = 0; h < 2; h++) {
							val += arr[i+l][j + h] * tile[k][l][h];
						}
					}
					max = Math.max(val, max);
				}
			}
		}
		for(int i = 0; i < r - 2; i++) {
			for(int j = 0; j < c; j++) {
				int val = arr[i][j] + arr[i + 1][j] + arr[i + 2][j];
				max = Math.max(val, max);
			}
		}
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c - 2; j++) {
				int val = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				max = Math.max(val, max);
			}
		}
		
		System.out.println(max);
	}

	public static void main(String[] args) throws Exception {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		input();
		solve();
	}

}