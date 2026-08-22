class Solution {
    public int minOperations(int[] nums, int k) {
        int n=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=nums[i]+sum;
        }
        n=sum%k;
        return n;
    }
}