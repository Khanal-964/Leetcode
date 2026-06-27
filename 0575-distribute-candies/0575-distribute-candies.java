class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        int distinct=1;

        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                distinct++;
            }
        }
        return Math.min(distinct, n/2);

    }
}