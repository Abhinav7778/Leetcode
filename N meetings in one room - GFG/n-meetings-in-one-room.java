//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        
        int[][] me = new int[start.length][2];
        
        
        for(int i = 0; i < start.length; ++i)
        {
            me[i][0] = start[i];
            me[i][1] = end[i];
        }
        
        Arrays.sort(me, (a,b) -> (a[1] - b[1]));
        
        
        int count = 0;
 
        int e = 0;
        for(int[] i : me)
        {
            if(i[0] > e)
            {
                ++count;
                e = Math.max(e, i[1]);
            }
        }
        
        return count;
        
    }
}
