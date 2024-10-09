import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n, m;
    static int[][] arr;
    static void input() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

    }


    static void solve() throws Exception{
        int ans = 0;
        for(int i = 1; i <= n; i++){
            boolean happy = false;
            int target = -1;
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                
                if(target != arr[i][j]){
                   cnt = 0;
                   target = arr[i][j];
                }
                cnt++;
                if(cnt == m){
                    happy = true;
                    break;
                }
                
            }

            if(happy)
                ans++;
        }

        for(int i = 1; i <= n; i++){
            boolean happy = false;
            int target = -1;
            int cnt = 1;
            for(int j = 1; j <= n; j++){
                
                if(target != arr[j][i]){
                   cnt = 0;
                   target = arr[j][i];
                }
                cnt++;
                if(cnt == m){
                    happy = true;
                    break;
                }
            }

            if(happy)
                ans++;
        }
        bw.write(String.valueOf(ans));
    }
    public static void main(String[] args) throws Exception{
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
        bw.flush();
    }
}