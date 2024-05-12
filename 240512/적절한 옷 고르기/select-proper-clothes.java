import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static class Cloth{
        int s, e, v;

        public Cloth(int s, int e, int v) {
            this.s = s;
            this.e = e;
            this.v = v;
        }
    }
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n, m;
    static Cloth[] cloths;
    static int[][] dp;
    static void input() throws IOException {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        cloths = new Cloth[n + 1];
        for(int i = 1 ; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            cloths[i] = new Cloth(s, e, v);
        }
        dp = new int[m + 1][n+1];
        for(int i = 1; i <= m; i++)
            for(int j = 1; j <= n; j++)
                dp[i][j] = Integer.MIN_VALUE;

        for(int j = 1; j <= n; j++)
            if(cloths[j].s == 1)
                dp[1][j] = 0;

    }
    static void solve(){
        for(int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (cloths[j].s <= i && i <= cloths[j].e) {
                    for (int k = 1; k <= n; k++) {
                            dp[i][j] = Math.max(dp[i - 1][k] + Math.abs(cloths[k].v - cloths[j].v), dp[i][j]);
                    }
                }
            }
        }
        int ans = 0;


//        for(var a : dp){
//            for(var b : a){
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
        for( int a : dp[m]){
                ans = Math.max(ans, a);
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