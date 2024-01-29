class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int l=n*2;
        int[] ans=new int[l];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}