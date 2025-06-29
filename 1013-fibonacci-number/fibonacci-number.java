class Solution {
    public int fib(int n) {
        
        // in fibonacci series number it is defined when sum of two numbers 
        // MEANS OF F(N) = F(N-1) + F(N-2)
        // SIMPLY MEANS THAT f(3) = f(2) + f(1);
        if( n <= 1){
        
        
        return n ;
        }
       return fib(n-1) + fib(n-2) ;
    }

        


    }
