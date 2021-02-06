class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            int count = map.getOrDefault(i,0);
            map.put(i,++count);
        }
        for(Map.Entry<Integer, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                sum+=entry.getKey();
            }
        }
        return sum;
    }
}
