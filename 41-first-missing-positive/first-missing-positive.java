class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int pred=1;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0){
                continue;
            }
            if(nums[i]==pred){
                pred++;
            }
            if(nums[i]!=pred){
                ans=pred;
                
            }
            


        }
        if(nums.length==1){
            if(nums[0]==0){
                return nums[0]+1;
            }
            if(nums[0]==1){
                return 2;
            }
            if(nums[0]>1){
                return 1;
            }
        }
        else{
        return ans;
           }
           return 1;
    }
}