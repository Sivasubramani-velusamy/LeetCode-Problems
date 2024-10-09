class Solution {
    public String largestNumber(int[] nums) {
        String[] S_arr = new String[nums.length];
        
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                break;
            }
            if(j==nums.length-1){
                return "0";
            }
        }
        int i=0;
        for (int s:nums){
            S_arr[i]=String.valueOf(s);
            i++;
        }
        for(i=0;i<S_arr.length;i++){
            for(int j=i+1;j<S_arr.length;j++){
                String s1 = S_arr[i]+S_arr[j];
                String s2 = S_arr[j]+S_arr[i];
                if(s1.compareTo(s2)<0){
                    String temp = S_arr[i];
                    S_arr[i]=S_arr[j];
                    S_arr[j]=temp;
                }

            }
        }
        StringBuilder res = new StringBuilder();
        for(String s:S_arr){
            res.append(s);
        }
        
        return res.toString();
    }
}