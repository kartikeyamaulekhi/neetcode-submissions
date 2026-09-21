class Solution {
    public boolean isPalindrome(String s) {
       String cleaned = s.replaceAll("[^a-zA-Z0-9]", ""); 
       int i = 0;
       int j = cleaned.length() - 1;
       while(i < j){
        char ch = Character.toLowerCase(cleaned.charAt(i));
        char ch2 = Character.toLowerCase(cleaned.charAt(j));
        if(ch != ch2){
            return false;
        }
        i++;
        j--;
       }
        return true;
    }
}
