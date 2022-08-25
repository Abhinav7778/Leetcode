class Solution {

private int row;
private int col;
public int orangesRotting(int[][] grid) {
    
    //time ++ => 1 -> time
    //grid[i][j] < time ==> not change
    //DFS after grid[i][j] == 1 => -1 else time - 2;
    //time == result
    
    int result = 2; //Integer.MIN_VALUE;
    row = grid.length;
    col = grid[0].length;

    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            if(grid[i][j] == 2) {
                DFS(i, j, grid, 2);
            }
        }
    }
    
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {     
            if(grid[i][j] == 1) {
                return -1;
            }
            result = Math.max(result, grid[i][j]);
        }
    }
    return result-2;
}

public void DFS(int i, int j, int[][] grid, int minute) {
    
    if(i < 0 || i>=row || j < 0 || j >= col || grid[i][j] == 0) return;
    
    if(grid[i][j] > 1 &&  grid[i][j]< minute) return;
    
    grid[i][j] = minute;           
    minute++;
    
    DFS(i+1, j, grid, minute);
    DFS(i-1, j, grid, minute);
    DFS(i, j+1, grid, minute);
    DFS(i, j-1, grid, minute);
}
}