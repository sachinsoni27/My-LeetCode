class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;

        int[] arr = new int[n + m];

        for (int i = 0; i < n; i++) {
            arr[i] = a[i];
        }

        for (int i = 0; i < m; i++) {
            arr[n + i] = b[i];
        }

        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                ans.add(arr[i]);
            }
        }

        return ans;
    }
}