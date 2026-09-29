class Solution {
    boolean[][][] vis;
    int m, n;

    public boolean hasValidPath(char[][] g) {
        m = g.length; n = g[0].length;

        if ((m + n - 1) % 2 == 1 || g[0][0] == ')' ||
            g[m-1][n-1] == '(') return false;

        vis = new boolean[m][n][m + n];
        return dfs(g, 0, 0, 0);
    }

    boolean dfs(char[][] g, int i, int j, int b) {
        b += g[i][j] == '(' ? 1 : -1;

        if (b < 0 || b > (m-1-i) + (n-1-j) || vis[i][j][b])
            return false;

        if (i == m-1 && j == n-1) return b == 0;

        vis[i][j][b] = true;

        return (i+1 < m && dfs(g, i+1, j, b)) ||
               (j+1 < n && dfs(g, i, j+1, b));
    }
}
