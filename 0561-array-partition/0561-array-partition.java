// class Solution {
//     public int arrayPairSum(int[] nums) {
//         int sum=0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length-1-i;j++){
//                 if(nums[j]>nums[j+1]){
//                 int temp=nums[j];
//                 nums[j]=nums[j+1];
//                 nums[j+1]=temp;
//             }

//             }
            
//         }
        
//         for(int i=0;i<nums.length-1;i++){
//                 if(nums[i]<nums[i+1] ){
//                     sum=sum+nums[i];
//                 }else if(nums[i+1]<nums[i]){
//                     sum=sum+nums[i+1];
//                 }else{
//                     if(nums[i]==nums[i+1]){
//                         sum=sum+nums[i];
//                     }
//                 }
//                 i++;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Solution obj=new Solution();
//          int nums[]={1,4,3,2};
//         System.out.println(obj.arrayPairSum(nums)); 
//     }
// }

class Solution {
public int arrayPairSum(int[] nums) {
    Arrays.sort(nums);
    int result = 0;
    for(int itr = 0; itr < nums.length; itr += 2){
        result += nums[itr];
    }
    return result;
}
}