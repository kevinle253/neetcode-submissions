class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> test = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!test.containsKey(s.charAt(i))) {
                test.put(s.charAt(i), 1);
            } else {
                test.put(s.charAt(i), test.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!test.containsKey(t.charAt(i)) || test.get(t.charAt(i)) == 0) {
                return false;
            } else {
                test.put(t.charAt(i), test.get(t.charAt(i)) - 1);
            }
        }
        return true;
    }
}
