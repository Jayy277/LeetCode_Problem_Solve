// Example 1:

// Input: nums = [1,4,3,2]
// Output: 4
// Explanation: All possible pairings (ignoring the ordering of elements) are:
// 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
// 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
// 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
// So the maximum possible sum is 4.
// Example 2:

// Input: nums = [6,2,6,5,1,2]
// Output: 9
// Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
 

class Solution {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }

            }
            
        }
        
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]<nums[i+1] ){
                    sum=sum+nums[i];
                }else if(nums[i+1]<nums[i]){
                    sum=sum+nums[i+1];
                }else{
                    if(nums[i]==nums[i+1]){
                        sum=sum+nums[i];
                    }
                }
                i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
         int nums[]={1,4,3,2};
        System.out.println(obj.arrayPairSum(nums)); 
    }
}
