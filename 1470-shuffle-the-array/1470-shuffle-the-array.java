class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr=new int[nums.length];
        int start=0;
        int end=n;
        int i=0;
        while(start!=n && end!=nums.length){
            arr[i]=nums[start];
            i++;
            arr[i]=nums[end];
            i++;
            start++;
            end++;
        }
        return arr;
    }
}