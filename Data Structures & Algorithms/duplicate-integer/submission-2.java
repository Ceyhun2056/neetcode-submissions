class Solution {
    public boolean hasDuplicate(int[] nums) {
       Arrays.sort(nums);
        for(int i=0;i+1<nums.length;i++){
            if(nums[i+1]==nums[i]){
                return true;
            }
        }
        return false;
    }
}