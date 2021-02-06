class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int currPosSum = nums[0]>0?nums[0]:0;
        int currNegSum = nums[0]<0?nums[0]:0;
        for(int i=1;i<n;i++){
            
            int newPosSum =currPosSum + nums[i];
            int newNegSum =currNegSum + nums[i];
            if(currPosSum >=0 && newPosSum <0){
                currPosSum = 0;
            }else{
                currPosSum = newPosSum;
            }
            if(currNegSum <=0 && newNegSum >0){
                currNegSum = 0;
            }else{
                currNegSum = newNegSum;
            }
            if(Math.abs(currNegSum)>max){
                max = Math.abs(currNegSum);
            }
            if(currPosSum>max)
                max = currPosSum;
            //System.out.println(i+" "+currPosSum+" "+currNegSum);
        }
        return max;
    }
}
