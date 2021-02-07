class Solution {
    public int maximumScore(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        int ans = 0;
        int temp = arr[0] + arr[1];
        if(temp < arr[2]){
            return temp;
        }
        ans+= arr[2];
        temp-=arr[2];
        ans += temp/2;
        return ans;
    }
}
