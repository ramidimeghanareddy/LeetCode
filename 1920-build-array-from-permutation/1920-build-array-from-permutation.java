class Solution {
    public int[] buildArray(int[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<n.length;i++){
            n[i]=nums[nums[i]];
        }
        return n;
    }
}