class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int length = nums2.length;
        int[] checks = new int[length];
        List<Integer> answers = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j< nums2.length; j++){
                if(checks[j] == 1) continue;
                if(nums1[i] == nums2[j]){
                    answers.add(nums1[i]);
                    checks[j] = 1;
                    break;
                }
            }
        }

        return answers.stream().mapToInt(i -> i).toArray();
    }
}