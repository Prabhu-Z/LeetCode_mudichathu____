class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        int pred = 1;

        for(int i=0;i<nums.length;i++) {
            
            if(nums[i]<=0){
                continue;
            }
            if(nums[i]==pred){
                pred++;
            }
            else if(nums[i]>pred){
                return pred;
            }

            
        }

        return pred;
    }
}