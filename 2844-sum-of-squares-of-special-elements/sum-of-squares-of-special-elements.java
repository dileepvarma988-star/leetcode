class Solution {
    public int sumOfSquares(int[] nums) {
        int count =0;
        int x=nums.length;
        for(int i=1;i<=x;i++){
            if(x%i==0){
                count+=nums[i-1]*nums[i-1];
            }
        }
        return count;

    }
}