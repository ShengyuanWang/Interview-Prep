class Solution {
    public List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word : words) {
            int[] freq = new int[26];
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                freq[ch-'a']++;
            }
            for (int i = 0; i < 26; i++) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }
        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; i++) {
            int n = minfreq[i];
            while (n-- > 0) {
                ans.add(String.valueOf((char)(i+'a')));
            }
        }
        return ans;

    }
}