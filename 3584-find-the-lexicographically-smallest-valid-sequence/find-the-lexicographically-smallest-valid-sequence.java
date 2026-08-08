class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // suf[i] = earliest index in word1 from which
        // word2[i...] can be matched exactly.
        int[] suf = new int[m + 1];

        suf[m] = n;

        int p = n - 1;

        for (int i = m - 1; i >= 0; i--) {
            while (p >= 0 && word1.charAt(p) != word2.charAt(i)) {
                p--;
            }

            if (p < 0) {
                suf[i] = -1;
            } else {
                suf[i] = p;
                p--;
            }
        }

        int[] ans = new int[m];

        int j = 0;
        boolean changed = false;

        for (int i = 0; i < n && j < m; i++) {

            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
            } 
            else if (!changed) {

                // If we change word1[i], the rest must match exactly.
                if (j + 1 == m || suf[j + 1] > i) {
                    ans[j] = i;
                    j++;
                    changed = true;
                }
            }
        }

        if (j == m) {
            return ans;
        }

        return new int[0];
    }
}