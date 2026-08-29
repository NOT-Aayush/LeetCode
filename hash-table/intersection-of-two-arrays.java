class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                ans.add(n);
                set.remove(n);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}