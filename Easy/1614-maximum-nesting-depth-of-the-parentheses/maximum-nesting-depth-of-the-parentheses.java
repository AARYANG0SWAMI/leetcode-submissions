class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int depth = 0;
        for(int i = 0;i<s.length() ;i++){
            if(s.charAt(i) == '(')
                max ++;
                if(max > depth)
                    depth = max;
            if(s.charAt(i) == ')')
                    max--;
        }
        return depth;
    }
}