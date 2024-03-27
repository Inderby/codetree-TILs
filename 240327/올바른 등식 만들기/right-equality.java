import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n, m;
    static int[] arr;
    static long[][] dp;
    static int OFFSET = 20;

    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        dp = new long[n + 1][41];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[1][OFFSET + arr[1]] = 1;
        dp[1][OFFSET - arr[1]] = 1;
    }

    static void solve() {
        for (int i = 2; i <= n; i++) {
            for (int j = -20; j <= 20; j++) {
                if(OFFSET + j - arr[i] >= 0){
                    dp[i][OFFSET + j] += dp[i - 1][OFFSET + j - arr[i]];
                }

                if(OFFSET + j + arr[i] <= 40){
                    dp[i][OFFSET + j] += dp[i - 1][OFFSET + j + arr[i]];
                }
            }
        }
        
        System.out.println(dp[n][OFFSET + m]);
    }

    public static void main(String[] args) throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
    }
}