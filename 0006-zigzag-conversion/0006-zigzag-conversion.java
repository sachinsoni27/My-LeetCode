class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] zig = new StringBuilder[numRows];
        for (int k = 0; k < numRows; k++) {
            zig[k] = new StringBuilder();
        }
        int i = 0;
        while (i < s.length()) {

            for (int j = 0; j < numRows && i < s.length(); j++) {
                zig[j].append(s.charAt(i));
                i++;
            }

            for (int j = numRows - 2; j >= 1 && i < s.length(); j--) {
                zig[j].append(s.charAt(i));
                i++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder str : zig) {
            res.append(str);
        }
        return res.toString();
    }
}