class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count[]= new int[1000];
        for(int num: nums){
            count[num]++;
        }
        int totalCount=0;
        for(int i: count){
            totalCount += ((i)*(i-1))/2;
        }
        return totalCount;
    }
}





