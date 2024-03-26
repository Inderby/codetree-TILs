import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n, k;
    static final int MIN = -10000 * 100000;
    static int[] arr;
    static int[][] dp;
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        arr = new int[n + 1];
        dp = new int[n+1][k+1];
        for(int i = 0; i <= n; i++){
            Arrays.fill(dp[i], MIN);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i][0] = arr[i];
        }
    }
    static void solve(){
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= k; j++){
                if(dp[i+1][0] < 0){
                    if(j + 1 > k){
                        continue;
                    }
                    dp[i+1][j+1] = Math.max(dp[i+1][j+1], dp[i][j] + arr[i+1]);
                }else{
                    dp[i+1][j] = Math.max(dp[i+1][j], dp[i][j] + arr[i+1]);
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <=k; j++){
                ans = Integer.max(ans, dp[i][j]);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
    }
}