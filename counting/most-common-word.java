class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();

        String[] words = paragraph.toLowerCase().split("[!?',;. ]+");

        String ans = "";
        int max = 0;

        for (String word : words) {
            if (!ban.contains(word)) {
                int count = map.getOrDefault(word, 0) + 1;
                map.put(word, count);

                if (count > max) {
                    max = count;
                    ans = word;
                }
            }
        }

        return ans;
    }
}