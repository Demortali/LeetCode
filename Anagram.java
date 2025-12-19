class Solution {
    public boolean isAnagram(String s, String t) {
        // If the length are different, they can't be anagrams
        if (s.length() != t.length())
            return false; 
        //create an array count frequencies
        int[] charCounts = new int[26];

        //Increment count for wach character in "s" and decrement for each in  "t"
        for (int i = 0; i < s.length(); i++) {
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //Check if all counts are zero
        for (int count : charCounts) {
            if (count != 0){
                return false;
            }
        }


        return true; //all counts are zerof
    }

}