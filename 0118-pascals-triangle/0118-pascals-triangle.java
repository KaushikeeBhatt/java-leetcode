import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) {
                    row.add(1);  // edges are 1
                } else {
                    int val = triangle.get(r-1).get(c-1) + triangle.get(r-1).get(c);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        
        return triangle;
    }
}
