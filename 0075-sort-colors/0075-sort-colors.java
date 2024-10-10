class Solution {
    public void sortColors(int[] nums) {
        // int start = 0;
        // int end = nums.length-1;
        // while(s < end){
        //     if(nums[start]>nums[end]){
        //         int temp = num
        //     }
        // }

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }

            }
        }
    }
}