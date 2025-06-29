class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        // ok so in water bottle problem questions there are two numbottles and numexchange 3 empty bottles get 1 full water bottle 



        // lets take the help of the second bottle  example there are 15 filled bottles and num of bottles that can be exchanged is 4 so if we divide 15 by 4 then we will get unfilled or remaining bottles and the new bottles and then simply add the remaining bottles and the new bottles again and again
        // so there are num of bottles bottles exchange remaining bottles new bottles 
        int ans = numBottles;
        while(numBottles >= numExchange){
            int newBottles = numBottles / numExchange ;

            int remainBottles = numBottles % numExchange ; // as we have to find remainder ; 
            
            ans =  ans + newBottles ;

            numBottles = newBottles + remainBottles ;
            // keep in mind the 15 num bottles 4 exchange bottles 3 new bottles and w 3 remaining bottles 
        }
        return ans ;
    }
}