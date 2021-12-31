class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for(int i=0; i<nums.length; i++){
            
            Integer diff = (Integer)(target - nums[i]);    
            if(hash.containsKey(diff)){
                int answer[] = {hash.get(diff), i};
                return answer;
            }else{
                hash.put(nums[i], i);
            }
        }
        
        return null;
    }
}