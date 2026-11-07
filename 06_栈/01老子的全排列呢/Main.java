public class Main {
    static int[] a = new int[8];
    static boolean[] v = new boolean[9];

    static void dfs(int p) {
        if (p == 8) {
            for (int i = 0; i < 8; i++) System.out.print((i > 0 ? " " : "") + a[i]);
            System.out.println();
            return;
        }
        for (int i = 1; i <= 8; i++)
            if (!v[i]) { v[i] = true; a[p] = i; dfs(p + 1); v[i] = false; }
    }

    public static void main(String[] args) { dfs(0); }
    //用了ai，这道题对java及其不友好
}
