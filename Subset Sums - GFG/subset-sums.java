//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
// class Solution{
//     ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
//         // code here
//         ArrayList<Integer> res = new ArrayList<>();
        
//         helper(0, 0, res, arr, N);
        
//         return res;
//     }
//     public void helper(int ind, int sum, ArrayList<Integer> res, ArrayList<Integer> arr, int N)
//     {
//         if(ind == N)
//         {
//             res.add(sum);
//             return;
//         }
        
//         helper(ind + 1, sum, res, arr, N);
        
//         helper(ind + 1, sum + arr.get(ind), res, arr, N);
        
//         return;
//     }
// }





class Solution {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        // Collections.sort(arr);
        helper(res, ans, arr, 0);
        
        return res;
    }
    
    public void helper(List<Integer> res, List<Integer> ans, List<Integer> nums, int index)
    {
    
        res.add(sum(ans));
        
        for(int i = index; i < nums.size(); ++i)
        {
            
            ans.add(nums.get(i));
            helper(res, ans, nums,  i + 1);
            ans.remove(ans.size() - 1);
        }
    }
    
    public int sum(List<Integer> ans)
    {
        int s = 0;
        for(int i : ans)
        {
            s+=i;
        }
        return s;
    }
}