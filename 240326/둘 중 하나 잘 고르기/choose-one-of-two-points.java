import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n;
    static int[][] arr, dp;
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new int[n * 2 + 1][2];
        dp = new int[n+1][n+1];

        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], -1);
        }

        for(int i = 1; i <= n * 2; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        dp[0][0] = 0;
        for(int i = 1; i <= n; i++){
            dp[0][i] = dp[0][i - 1] + arr[i][1];
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }
    }
    static void solve(){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){

                dp[i][j] = Math.max(dp[i][j], dp [i][j-1] + arr[i + j][1]);
                dp[i][j] = Math.max(dp[i][j], dp [i - 1][j] + arr[i + j][0]);
            }
        }
        System.out.println(dp[n][n]);
    }
    public static void main(String[] args) throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
    }
}