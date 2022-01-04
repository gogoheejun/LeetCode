class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        
        for(int i=len-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(nums[j] == 0){
                    int tmp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
    }
}