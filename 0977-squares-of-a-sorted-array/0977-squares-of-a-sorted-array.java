// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i]=(nums[i]*nums[i]);
//         }
//         for(int i=0;i<nums.length;i++){
//             for(int j=0;j<nums.length-1;j++){
//                 if(nums[j]>nums[j+1]){
//                     int tamp=nums[j];
//                     nums[j]=nums[j+1];
//                     nums[j+1]=tamp;
            
//                 }
//             }
            
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[nums.length];
        int index = nums.length - 1;

        while (left <= right) {

            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }

            index--;
        }

        return result;
    }
}