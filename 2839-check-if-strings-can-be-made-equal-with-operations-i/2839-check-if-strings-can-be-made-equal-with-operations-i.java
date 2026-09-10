class Solution {
    public boolean canBeEqual(String s1, String s2) {

        int n = s1.length();
        char[] chars = s1.toCharArray();

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (i - j == 2) {

                    // First swap
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;

                    // Check after first swap
                    if (String.valueOf(chars).equals(s2)) {
                        return true;
                    }

                    // Try the other possible swap
                    for (int x = 0; x < n; x++) {
                        for (int y = 0; y < n; y++) {

                            if (x - y == 2) {

                                temp = chars[x];
                                chars[x] = chars[y];
                                chars[y] = temp;

                                if (String.valueOf(chars).equals(s2)) {
                                    return true;
                                }

                                // swap back
                                temp = chars[x];
                                chars[x] = chars[y];
                                chars[y] = temp;
                            }
                        }
                    }

                    // First swap back
                    temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }

        return s1.equals(s2);
    }
}