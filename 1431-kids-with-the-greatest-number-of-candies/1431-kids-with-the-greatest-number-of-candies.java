class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l=new ArrayList<Boolean>();
        int max=0;
        int tot=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<candies.length;i++){
            tot=candies[i]+extraCandies;
            l.add(tot>=max);
        }
        return l;
    }
}