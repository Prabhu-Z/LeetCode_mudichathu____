class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sliding=0;
    
        for(int i=0;i<k;i++){
            sliding+=nums[i];

        }
        int max=sliding;
        max=Math.max(max,sliding);
        for(int i=k;i<nums.length;i++){
            sliding+=nums[i];
            sliding-=nums[i-k];
            max=Math.max(max,sliding);

        }
        return (double)max/k;
    }
}