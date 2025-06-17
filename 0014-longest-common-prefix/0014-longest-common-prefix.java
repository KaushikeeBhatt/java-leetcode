class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        int n = Integer.MAX_VALUE;
        for (String s : strs) {
            n = Math.min(n, s.length());
        }

        StringBuilder g = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char l = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != l) {
                    return g.toString();
                }
            }
            g.append(l);
        }

        return g.toString();
    }
}
