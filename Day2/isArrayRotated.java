class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int[] copy = new int[n];
        int[] comp = new int[n];
        int start = 0;
        for(int i=0;i<n;i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
        
        int prev = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<prev){
                start = i;
            }
            prev = nums[i];
        }
        int pos =0;
        for(int i=start;i<n;i++){
            comp[pos++] = nums[i]; 
        }
        for(int i=0;i<start;i++){
            comp[pos++] = nums[i];
        }
        for(int i=0;i<n;i++){
            if(comp[i]!=copy[i]){
                return false;
            }
        }
        return true;
    }
}
