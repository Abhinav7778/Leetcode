class Solution {
    public double myPow(double x, int n) {
        if(n == 0 || x == 1)
            return 1;
        if(n == 1)
            return x;
        if(x == 0)
            return 0;
        return n > 0 ? helper(x, n) : 1/helper(x, n);
    }
    public double helper(double x, int n)
    {
        if(n == 1 || n == -1)
            return x;
        double rec = helper(x, n/2);
        if(n%2 != 0)
            return x * rec * rec;

        return rec * rec;
    }
}