class Solution {
    public boolean isPalindrome(int x) {


        int copy=x;
        int revNum=0;

        while(x>0){
            int lastDigit= x%10;
            x=x/10;

            revNum= revNum*10+lastDigit;

        }

        if(revNum==copy){
            return true;
        }else{
            return false;
        }
        
    }
}