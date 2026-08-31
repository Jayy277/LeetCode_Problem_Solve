class Solution {
    public int prefixCount(String[] words, String pref) {
        int num=0;
        for(String word:words){
            if(word.startsWith(pref)){
                num++;
            }
            
        }
        return num;
    }
}