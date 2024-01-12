class Solution {
    public boolean isHappy(int n) {
        Set<Integer> appear = new HashSet<>();
        while ( n!=1 && !appear.contains(n)) {
            appear.add(n);
            n = getNext(n);
        }
        return n == 1;
    }
    public int getNext(int n) {
        int totalSum = 0;
        while ( n > 0) {
            int d = n %10;
            n = n / 10;
            totalSum = totalSum + d * d;
        }
        return totalSum;
    }
}