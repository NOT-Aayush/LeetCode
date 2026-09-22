class Solution {
    public String toGoatLatin(String sentence) {
        int aCnt = 1;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        StringBuilder ans = new StringBuilder();
        String[] arr = sentence.trim().split("\\s+");
        for (String s : arr){
            if (vowels.contains(s.charAt(0))){
                ans.append(s);
            }
            else{
                ans.append(s.substring(1)+s.charAt(0));
            }
            ans.append("ma");
            ans.append("a".repeat(aCnt++)+" ");
        }
        return ans.toString().trim();
    }
}