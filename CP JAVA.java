import java.util.*;
import java.io.*;
 
public class Main {
 
    static long startTime = System.currentTimeMillis();
 
    // for global initializations and methods starts here
 
    // global initialisations and methods end here
 
    static void run() {
        boolean tc = true;
        ImranIO r = new ImranIO();
        //FastReader r = new FastReader();
 
        try (OutputStream out = new BufferedOutputStream(System.out)) {
 
            //long startTime = System.currentTimeMillis();
 
            int testcases = tc ? r.ni() : 1;
            int tcCounter = 1;
            // Hold Here Sparky------------------->>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            // Solution Starts Here
 
            start:
            while (testcases-- > 0) {
 
                int n = r.ni();
//                 List<Integer> list = new ArrayList<>();
//                 for (int i = 0; i < n; i++) list.add(r.ni());
 
//                 int min = Collections.min(list);
//                 int max = Collections.max(list);
 
//                 int ind1 = list.indexOf(min);
//                 int ind2 = list.indexOf(max);
                                                            // S O L U T I O N
//                 if (ind1 > ind2) {
//                     ind1 ^= ind2;
//                     ind2 ^= ind1;
//                     ind1 ^= ind2;
//                 }
 
//                 out.write((Collections.min(Arrays.asList(ind2 + 1, ind1 + 1 + n - ind2, n - ind1)) + " ").getBytes());
//                 out.write(("\n").getBytes());
            }
            // Solution Ends Here
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    static class ImranIO {
        final private int BUFFER_SIZE = 1 << 16;
        private final DataInputStream din;
        private final byte[] buffer;
        private int bufferPointer, bytesRead;
        public BufferedReader br;
        public StringTokenizer st;
 
        public ImranIO() {
            br = new BufferedReader(new InputStreamReader(System.in));
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public ImranIO(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }
 
        public String word() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        public String line() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
        public String readLine() throws IOException {
            byte[] buf = new byte[100000001]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') break;
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }
 
        public int ni() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }
 
        public long nl() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (neg) return -ret;
            return ret;
        }
 
        public double nd() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') c = read();
            boolean neg = (c == '-');
            if (neg) c = read();
            do {
                ret = ret * 10 + c - '0';
            }
            while ((c = read()) >= '0' && c <= '9');
            if (c == '.') while ((c = read()) >= '0' && c <= '9') ret += (c - '0') / (div *= 10);
            if (neg) return -ret;
            return ret;
        }
 
        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) buffer[0] = -1;
        }
 
        private byte read() throws IOException {
            if (bufferPointer == bytesRead) fillBuffer();
            return buffer[bufferPointer++];
        }
 
        public void close() throws IOException {
            if (din == null) return;
            din.close();
        }
    }
 
    public static void main(String[] args) throws Exception {
        run();
    }
 
    static long mod = 998244353;
 
    static long modInv(long base, long e) {
        long result = 1;
        base %= mod;
        while (e > 0) {
            if ((e & 1) > 0) result = result * base % mod;
            base = base * base % mod;
            e >>= 1;
        }
        return result;
    }
 
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
 
        String word() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        String line() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
 
        int ni() {
            return Integer.parseInt(word());
        }
 
        long nl() {
            return Long.parseLong(word());
        }
 
        double nd() {
            return Double.parseDouble(word());
        }
    }
 
    static int MOD = (int) (1e9 + 7);
 
    static long powerLL(long x, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) result = result * x % MOD;
            n = n / 2;
            x = x * x % MOD;
        }
        return result;
    }
 
    static long powerStrings(int i1, int i2) {
        String sa = String.valueOf(i1);
        String sb = String.valueOf(i2);
        long a = 0, b = 0;
        for (int i = 0; i < sa.length(); i++) a = (a * 10 + (sa.charAt(i) - '0')) % MOD;
        for (int i = 0; i < sb.length(); i++) b = (b * 10 + (sb.charAt(i) - '0')) % (MOD - 1);
        return powerLL(a, b);
    }
 
    static long gcd(long a, long b) {
        if (a == 0) return b;
        else return gcd(b % a, a);
    }
 
    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }
 
    static long lower_bound(List<Long> list, long k) {
        int s = 0;
        int e = list.size();
        while (s != e) {
            int mid = (s + e) >> 1;
            if (list.get(mid) < k) s = mid + 1;
            else e = mid;
        }
        if (s == list.size()) return -1;
        return s;
    }
 
    static int upper_bound(List<Long> list, long k) {
        int s = 0;
        int e = list.size();
        while (s != e) {
            int mid = (s + e) >> 1;
            if (list.get(mid) <= k) s = mid + 1;
            else e = mid;
        }
        if (s == list.size()) return -1;
        return s;
    }
 
    static void addEdge(ArrayList<ArrayList<Integer>> graph, int edge1, int edge2) {
        graph.get(edge1).add(edge2);
        graph.get(edge2).add(edge1);
    }
 
    public static class Pair implements Comparable<Pair> {
        int first;
        int second;
 
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
 
        public String toString() {
            return "(" + first + "," + second + ")";
        }
 
        public int compareTo(Pair o) {
            // TODO Auto-generated method stub
            if (this.first != o.first)
                return (int) (this.first - o.first);
            else return (int) (this.second - o.second);
        }
    }
 
    public static class PairC<X, Y> implements Comparable<PairC> {
        X first;
        Y second;
 
        public PairC(X first, Y second) {
            this.first = first;
            this.second = second;
        }
 
        public String toString() {
            return "(" + first + "," + second + ")";
        }
 
        public int compareTo(PairC o) {
            // TODO Auto-generated method stub
            return o.compareTo((PairC) first);
        }
    }
 
    static boolean isCollectionsSorted(List<Long> list) {
        if (list.size() == 0 || list.size() == 1) return true;
        for (int i = 1; i < list.size(); i++) if (list.get(i) <= list.get(i - 1)) return false;
        return true;
    }
 
    static boolean isCollectionsSortedReverseOrder(List<Long> list) {
        if (list.size() == 0 || list.size() == 1) return true;
        for (int i = 1; i < list.size(); i++) if (list.get(i) >= list.get(i - 1)) return false;
        return true;
    }
 
}
