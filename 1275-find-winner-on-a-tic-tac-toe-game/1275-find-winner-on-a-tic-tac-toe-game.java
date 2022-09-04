class Solution {
    public String tictactoe(int[][] moves) {
        int player = -1;
        
        int row[] = new int[3];
        int col[] = new int[3];
        int diag = 0;
        int antiDiag = 0;
        
        for(int i = 0; i < moves.length; ++i)
        {
            ++player;
            if(player % 2 == 0)
            {
                row[moves[i][0]]+= 1;
                col[moves[i][1]]+= 1;
                if(moves[i][0] == moves[i][1])
                {
                    ++diag;
                }
                if(moves[i][0] + moves[i][1] == 2)
                {
                    ++antiDiag;
                }
            }
            else
            {
                row[moves[i][0]]-= 1;
                col[moves[i][1]]-= 1;
                
                if(moves[i][0] == moves[i][1])
                {
                    --diag;
                }
                if(moves[i][0] + moves[i][1] == 2)
                {
                    --antiDiag;
                }
            }
        }
        

        if(row[0] == 3 || row[1] == 3 || row[2] == 3 || col[0] == 3  || col[1] == 3 || col[2] == 3 || diag == 3 || antiDiag == 3)
            return "A";
        if(row[0] == -3 || row[1] == -3 || row[2] == -3 || col[0] == -3  || col[1] == -3 || col[2] == -3  || diag == -3 || antiDiag == -3)
            return "B";
        return moves.length == 9 ? "Draw" : "Pending";
        
    }
}