class Solution {
    public boolean isPalindrome(int x) {
        int sep=0;
        int rev=0;
        int num=x;
        if(num<0){
            return false;
        }
        while(x!=0){
            sep=x%10;
            
            rev=rev*10+sep;
            x=x/10;
        }
        x=num;
        if(x==rev){
            return true;
        }
        return false;
    }
}