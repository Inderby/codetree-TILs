import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static StringTokenizer st;
    static int n;
    static int[] arr;
    static void input() throws Exception {
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
    }

    static void solve(){
        int ans = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            if(sum + arr[i] < 0){
                sum = 0;
                continue;
            }

            sum += arr[i];
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws Exception{
        // 여기에 코드를 작성해주세요.
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        input();
        solve();
    }
}