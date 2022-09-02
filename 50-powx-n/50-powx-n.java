class Solution {
    public double myPow(double x, int n) {
        
        if(x == 0)return 0;
        if(n == 0)return 1;
        
        if(x == 1)return 1;
        
       return n > 0 ? helper(x, n) : 1/helper(x, n);
    }
    private double helper(double x, int n)
    {
        double rec;
        
        if(n == 1)
        {
            return x;
        }
        if(n == 0)
        {
            return 1;
        }
        
        rec = helper(x, n/2);
        
        return n % 2 == 0 ? rec * rec : rec * rec * x;
    }
}