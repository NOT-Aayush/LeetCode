class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();

        for (int slen = 1; slen <= len / 2; slen++) {
            if (len % slen != 0) continue;
            String sub = s.substring(0, slen);
            int i = slen;
            while (i < len) {
                String cur = s.substring(i, i + slen);
                if (!sub.equals(cur)) break;
                i += slen;
            }
            if (i == len) return true;
        }
        return false;
    }
}