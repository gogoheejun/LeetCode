class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i] + nums[j];
                if(sum == target) answer = new int[]{i,j};
            }
        }
        return answer;
    }
}