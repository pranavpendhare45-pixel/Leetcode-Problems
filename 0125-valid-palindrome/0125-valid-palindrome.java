class Solution {

    static boolean isPalindrome(String s) {
      
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(s, 0, s.length() - 1);
    }

    static boolean check(String s, int left, int right) {
      
        if (left >= right) return true;

       
        if (s.charAt(left) != s.charAt(right)) return false;

       
        return check(s, left + 1, right - 1);
    }}