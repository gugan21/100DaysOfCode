https://leetcode.com/problems/count-square-submatrices-with-all-ones/

class Solution {
    
    Boolean found = true;
    int m = 0;
    int n = 0;
    
    public Boolean findSquare(int[][] matrix, int a, int b, int size){
        if(a+size>m || b+size>n){
            return false;
        }
        
        
        for(int i=a; (i<=a+size-1 );i++){
            if(matrix[i][b+size-1]==1){
                continue;
            }else{
                return false;
            }
        }
        
        for(int i=b; (i<=b+size-1 );i++){
            if(matrix[a+size-1][i]==1){
                continue;
            }else{
                return false;
            }
        }
        
        return true;
        
    }
    
    public int findSquares(int[][] matrix, int[][] length, int size, int curr){
        found = false;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(length[i][j]==curr){
                    
                    if(findSquare(matrix, i, j, size)){
                        found = true;
                        length[i][j]=size;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    
    public int countSquares(int[][] matrix) {
        m = matrix.length;
        n = matrix[0].length;
        int[][] length = new int[m][n];
        int ans = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    ans++;
                    length[i][j]=1;
                }
            }
        }
        
        int curr = 1;
        int size = 2;
        while(found){
            
            ans += findSquares(matrix, length, size, curr);
            size++;
            curr++;
            
        }
        return ans;
    }
}
