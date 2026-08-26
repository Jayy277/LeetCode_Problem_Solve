// class Solution {
//     public boolean judgeCircle(String moves) {
//          int U=0;
//         int D=0;
//         int R=0;
//         int L=0;
//         HashSet <String> set =new HashSet<>();
//         for(char ch:moves.toCharArray()){
//             set.add(String.valueOf(ch));
//             if(ch=='U'){
//                 U++;
//             }else if(ch=='D'){
//                 D++;
//             }else if(ch=='R'){
//                 R++;
//             }else if(ch=='L'){
//                 L++;
//             }
//         }
//         if(U==D & R==L){
//             return true;
//         }else{
//             return false;
//         }
        
//     }
// }



class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;

        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);

            if (c == 'U') y++;
            if (c == 'D') y--;
            if (c == 'R') x++;
            if (c == 'L') x--;
        }

        return x == 0 && y == 0;
    }
}