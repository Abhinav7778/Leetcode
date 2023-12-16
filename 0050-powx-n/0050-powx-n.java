class Solution {
    public double myPow(double x, int n) {
        double res = helper(x, n);
        
       return n > 0 ? res : (1/res);
    }
    public double helper(double x, int n)
    {
        if(n == 0)
            return 1;
        else if(n == 1)
            return x;
        
        double temp = helper(x, n/2);
        
        return n%2 == 0 ? temp * temp : temp * temp * x;
    }
}