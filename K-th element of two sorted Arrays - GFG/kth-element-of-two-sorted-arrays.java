//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            int n = Integer.parseInt(stt.nextToken());
            int m = Integer.parseInt(stt.nextToken());
            int k = Integer.parseInt(stt.nextToken());
            int a[] = new int[(int)(n)];
            int b[] = new int[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.kthElement( a, b, n, m, k));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
        
        int p1 = 0, p2 = 0;
        int res = 0, count = 0;
        while(p1 < n && p2 < m)
        {
            if(count == k)return res;
            if(arr1[p1] < arr2[p2])
            {
                res = arr1[p1];
                ++p1;
            }
            else
            {
                res = arr2[p2];
                ++p2;
            }
            ++count;
        }
        
        while(p1 < n)
        {
            if(count == k)
                return res;
            res = arr1[p1];
            ++p1;
            ++count;
        }
        
        
        while(p2 < m)
        {
            if(count == k)
                return res;
            res = arr2[p2];
            ++p2;
            ++count;
        }
        
        return -1;
        
    }
}