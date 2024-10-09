class Solution {
    public int lengthOfLIS(int[] nums) {
       ArrayList<Integer> seq = new ArrayList<>();
       for( int i =0 ; i< nums.length; i++){
        if(seq.isEmpty() || seq.get(seq.size()-1) < nums[i])
        {
            seq.add(nums[i]);
            }
        else{
            int index = findIndex(seq,nums[i]);
            seq.set(index,nums[i]);
        }
       }
    return seq.size();
    }
    public int findIndex(ArrayList<Integer> seq,int nums){
        int start = 0, end = seq.size()-1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(seq.get(mid) == nums){
                return mid;
            }
            else if( seq.get(mid) > nums){
                end = mid ;
            }
            else {
                start= mid +1 ;;
            }
           
        }
        return start;
    }
}