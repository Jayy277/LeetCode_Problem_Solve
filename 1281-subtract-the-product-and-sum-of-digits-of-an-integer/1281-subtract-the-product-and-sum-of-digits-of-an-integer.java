class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int Product=1;
        int temp=n;
        while(n>0){
            Product=(n%10)*Product;
            sum=(n%10)+sum;
            n=n/10;
        }

        return  Product-sum;
    }
}