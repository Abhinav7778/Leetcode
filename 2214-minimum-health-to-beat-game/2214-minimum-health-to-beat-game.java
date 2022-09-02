class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long maxDamage = 0;
        long sumDamage = 1;
        for (int d : damage) {
            maxDamage = Math.max(maxDamage, d);
            sumDamage += d;
        }
        return sumDamage - Math.min(armor, maxDamage);
    }
}