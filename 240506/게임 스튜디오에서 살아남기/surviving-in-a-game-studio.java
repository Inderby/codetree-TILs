import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n;
    static int[][][] dp;
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        dp = new int[n+1][3][3]; // G, B, T
        dp[1][0][0] = 1;
        dp[1][1][0] = 1;
        dp[1][0][1] = 1;
    }
    static void solve(){
        for(int i = 1; i < n; i++){
           for(int j = 0; j < 3; j++){
               for(int k = 0; k < 3; k++){
                   dp[i+1][0][k] += dp[i][j][k];
                   dp[i+1][0][k]  %= 1000000007;
                   if(j != 2){
                        dp[i+1][j+1][k] += dp[i][j][k];
                       dp[i+1][j+1][k]  %= 1000000007;
                   }
                   if(k != 2){
                       dp[i+1][0][k+1] += dp[i][j][k];
                       dp[i+1][0][k+1]  %= 1000000007;
                   }
               }
           }
        }
        int result = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                result += dp[n][i][j];
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) throws IOException {
        
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
    }
}