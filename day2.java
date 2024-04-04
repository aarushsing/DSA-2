//Pascal Triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0 ; row < numRows; row++){
            result.add(nCr(row));
        }
        return result;
    }

    public List<Integer> nCr(int row){
        long initial = 1;

        List<Integer> temp = new ArrayList<>();
        temp.add(1);

        for(int i = 0 ; i < row ; i++){
            initial = initial * (row - i);
            initial = initial / (i+1) ;
            temp.add((int)initial);
        } 
        return temp;
    }
}