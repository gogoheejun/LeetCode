import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(Arrays.asList(1));
        for(int i=1; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for(int j=1; j<i;j++){
                row.add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
            }
            row.add(1);
            answer.add(row);
        }
        return answer;
    }
}