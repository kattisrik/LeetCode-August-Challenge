class Solution {
    public boolean detectCapitalUse(String word) {
        int countCapital=0;
        boolean isCapital;
        for (int i=0; i<word.length(); i++) {
            isCapital = Character.isUpperCase(word.toCharArray()[i]);
            if(isCapital)
                countCapital++;
        }
        
        if (countCapital==0 || countCapital==word.length())
            return true;
        if (countCapital==1) {
            if(Character.isUpperCase(word.toCharArray()[0]))
                return true;
            else
                return false;
        }
        return false;
        
    }
}