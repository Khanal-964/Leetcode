class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> tri = new ArrayList<>();
        int row=matrix.length;
        int cols=matrix[0].length;
        for(int i=0;i<row;i++){
            int mincols=0;
            for(int j=1 ;j<cols;j++){
                if(matrix[i][j] < matrix[i][mincols] ){
                    mincols=j;
                }
            }

            int candidate = matrix[i][mincols];

            boolean isLucky=true;

            for(int r=0;r<row;r++){
                if(matrix[r][mincols] > candidate){
                    isLucky= false;
                    break;
                }
            }

            if(isLucky){
                tri.add(candidate);
            }
        }
        return tri;
    }
}