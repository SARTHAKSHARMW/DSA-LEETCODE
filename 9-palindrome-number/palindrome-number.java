class Solution {
    public boolean isPalindrome(int x) {
        // palindrome numbers are those numbers whose reverse is eqaul to their number 
        // int remainder = num %10; STORES THE LAST DIGIT THEN 
        if(x < 0) {
            return false ; 

        }
        int n = x;
        int reverseNum = 0 ; // declare the reverse num as zero and checks the last digit 
        while(n > 0){
            int d = n%10;
            reverseNum = reverseNum*10 + d;
            n = n/10;
        }
        if(reverseNum == x){
        return true ;
        }else{
            return false ; 
        }
    }
}


        
