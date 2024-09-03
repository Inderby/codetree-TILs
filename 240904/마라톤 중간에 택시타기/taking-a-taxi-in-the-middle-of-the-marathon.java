import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static StringTokenizer st;
    static BufferedReader br;
    static BufferedWriter bw;

    static int n;

    static Pair[] arr;
    static int[] l;
    static int[] r;
    static int min = Integer.MAX_VALUE - 100;
    static void input() throws IOException {
        n = Integer.parseInt(br.readLine());
        arr = new Pair[n];
        l = new int[n];
        r = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[i] = new Pair(x, y);
            if(i != 0)
                l[i] = l[i-1] + arr[i].cal(arr[i-1]);
        }

        for (int i = n-2; i >= 0 ; i--) {
            r[i] = arr[i].cal(arr[i+1]) + r[i+1];
        }


    }

    static void solve() throws IOException {
        for(int i = 1; i < n - 1; i++){
            min = Integer.min(min, l[i-1] + r[i+1] + arr[i-1].cal(arr[i+1]));
        }
        System.out.println(min);
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        System.setOut(new PrintStream( new FileOutputStream("src/output.txt")));

        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        input();
        solve();
    }

    private static class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int cal(Pair p){
            int num = Math.abs(this.x - p.x);
            num += Math.abs(this.y - p.y);

            return num;
        }
    }
}