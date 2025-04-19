class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    list1.add(i);
                    list2.add(j);
                }
            }
        }
        for(int i: list1){
            for(int j=0;j<m;j++){
                matrix[i][j]=0;
            }
        }
        for(int k: list2){
            for(int j=0;j<n;j++){
                matrix[j][k]=0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}