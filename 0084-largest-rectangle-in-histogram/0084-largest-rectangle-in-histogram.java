class Solution {
    public int largestRectangleArea(int[] h) {
        
        //next smaller elem : mon dec stack
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int[] right = new int[h.length];
        Arrays.fill(right, -1);
        for(int i = 1; i < h.length; ++i)
        {
            while(!s.isEmpty() && h[s.peek()] > h[i])
            {
                right[s.pop()] = i;
            }
            s.push(i);
        }
        
        s = new Stack<>();
        int[] left = new int[h.length];
        Arrays.fill(left, -1);
        s.push(h.length - 1);
        for(int i = h.length - 2; i >= 0;  --i)
        {
            while(!s.isEmpty() && h[s.peek()] > h[i])
            {
                left[s.pop()] = i;
            }
            s.push(i);
        }

        
        int max = 0;
            
        for(int i=0; i<h.length; i++){
            if(right[i] == -1)
                right[i] = h.length;
            max = Math.max(max, h[i] * (right[i] - left[i] - 1));
        }
        
        
        return max;
    }
    
    //next smaller elem : mon dec stack
        //create a stack
//         Stack<Integer> s = new Stack<>();
//         s.push(0);
        
//         //create and fill leftSmallest array
//         System.out.println(" ");
//         System.out.println("A's LeftArray");
//         int[] left = new int[heights.length];
//         //Arrays.fill(left, -1);
        
//         for(int i = 0; i<heights.length; i++)
//         {
//             while(!s.isEmpty() && heights[s.peek()] >= heights[i])
//             {
//                 s.pop();
//             }
//             left[i] = s.isEmpty()? -1:s.peek();
//             s.push(i);
//         }
//         for(int i=0; i<heights.length; i++){
//             System.out.print(left[i]+" ");
//         }
//         System.out.println(" ");
        
//         //reset stack and reuse
//         s = new Stack<>();
        
//         //create and fill rightSmallest array
//         System.out.println("A's RightArray");
//         int[] right = new int[heights.length];
//         //Arrays.fill(right, -1);
//         s.push(heights.length-1);
//         for(int i = heights.length-1; i >= 0; i--)
//         {
//             while(!s.isEmpty() && heights[s.peek()] >= heights[i])
//             {
//                 s.pop();
//             }
//             right[i] = s.isEmpty()? heights.length : s.peek();
//             s.push(i);
//         }
//         for(int i=0; i<heights.length; i++){
//             System.out.print(right[i]+" ");
//         }


//         int max = 0;
        
//         for(int i=0; i<heights.length; i++){
//             max = Math.max(max, heights[i] * (right[i] - left[i] - 1));
//         }
        
//         return max;
    
}