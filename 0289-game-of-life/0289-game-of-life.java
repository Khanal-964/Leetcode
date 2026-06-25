class Solution {
    public void gameOfLife(int[][] board) {
        int r=board.length;
        int c=board[0].length;

        int[][] ans=new int[r][c];


        int[] cr={-1, -1, -1, 0, 0, 1,1,1 };
        int[] cc={-1, 0 ,1, -1 , 1 , -1 , 0, 1};

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live=0;
                for(int k=0;k<8;k++){
                    int nr=i+cr[k];
                    int nc=j+cc[k];

                    if(nr>=0 && nr<r && nc>=0 && nc<c && board[nr][nc]==1){
                        live++;
                    }
                }

                    if(board[i][j]==1){
                        if(live==2 || live==3){
                            ans[i][j]=1;
                        }
                    }
                    else{
                        if(live==3){
                            ans[i][j]=1;
                        }
                    }
                }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}