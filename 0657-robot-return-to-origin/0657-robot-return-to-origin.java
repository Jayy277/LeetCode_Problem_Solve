class Solution {
    public boolean judgeCircle(String moves) {
         int U=0;
        int D=0;
        int R=0;
        int L=0;
        HashSet <String> set =new HashSet<>();
        for(char ch:moves.toCharArray()){
            set.add(String.valueOf(ch));
            if(ch=='U'){
                U++;
            }else if(ch=='D'){
                D++;
            }else if(ch=='R'){
                R++;
            }else if(ch=='L'){
                L++;
            }
        }
        if(U==D & R==L){
            return true;
        }else{
            return false;
        }
    }
}