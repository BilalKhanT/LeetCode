class Solution {
    public int strStr(String haystack, String needle) {
        String input1 = haystack;
        String input2 = needle;
        int res = 0;
        for (int i = 0; i < haystack.length(); i++){
            if (haystack.contains(needle)){
                return haystack.indexOf(needle);
            }
            else{
                res = -1;
            }
        }
        return res;
    }
}