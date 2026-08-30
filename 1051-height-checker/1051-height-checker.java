class Solution {
    public int heightChecker(int[] heights) {
        int height=0;
        int expected[]=heights.clone();
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        for(int i=0;i<expected.length;i++){
        if(expected[i]!=heights[i]){
            height++;
        }

        }
        return height;
    }
}