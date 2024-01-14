class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer res = new StringBuffer();
        for (int start = 0; start < s.length(); start = start +2*k) {
            StringBuffer temp = new StringBuffer();
            int firstK = (start + k > s.length()) ? s.length() : start + k;
            int secondK = (start + 2*k > s.length()) ? s.length() : start + 2 * k;
            temp.append(s.substring(start, firstK));
            res.append(temp.reverse());
            if (firstK < secondK) {
                res.append(s.substring(firstK, secondK));
            }
        }
        return res.toString();
    }


}