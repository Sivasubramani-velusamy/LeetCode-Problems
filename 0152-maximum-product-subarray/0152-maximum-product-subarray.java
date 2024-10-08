// class Solution {
//     public int maxProduct(int[] nums) {
//         int max = nums[0];
//         int currentMax = 1;
//         for( int i = 0; i < nums.length; i++){
//             if (nums[0]==0 && nums.length ==1){
//                 return 0;
//             }
//             if(i ==0 && nums[0]==0){
//                 currentMax = 1;
//             }
//             else
//             {
//                 currentMax *= nums[i];
//             }
//             if(currentMax > max ){
//                 max = currentMax;
            
// }
//         }
//         return max;
//     }
// }

class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int p_max = Integer.MIN_VALUE;
        int s_max = Integer.MIN_VALUE;
        int prefix_subarr=1;
        int suffix_subarr=1;


        for(int i=0;i<nums.length;i++){
            prefix_subarr *=nums[i];
            if(prefix_subarr>p_max){
                p_max=prefix_subarr;
            }
            if(prefix_subarr==0){
                prefix_subarr=1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            suffix_subarr *=nums[i];
            if(suffix_subarr>s_max){
                s_max=suffix_subarr;
            }
            if(suffix_subarr==0){
                suffix_subarr=1;
            }
        }
        
        max= p_max > s_max ? p_max:s_max;

        return max;
    }
}