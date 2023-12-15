class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> indexList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            int val1 = nums[i];
            for (int j = i+1; j < nums.length; j++){
                int val2 = nums[j];
                if (val1 + val2 == target){
                    indexList.add(i);
                    indexList.add(j);
                    int[] indexArray = new int[indexList.size()];
                    for (int k = 0; k < indexList.size(); k++) {
                        indexArray[k] = indexList.get(k);
                    }

                    return indexArray;
                }
            }
        }
        return new int[0];
    }
}