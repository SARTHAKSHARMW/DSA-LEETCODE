class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        // at most two people ca
        //n be there in the boat and the sum of weights should not be or atmost equal to the limit so there are two approach two for loops i and j and if equals to tagret that way
        //2) create a start and end pointer and i 

        Arrays.sort(people);
        int start = 0 ;
        int end = people.length - 1;
        int count  = 0;
    
    while(start <= end){
        if(people[start]  + people[end] <= limit ){
            start ++ ;
            end -- ; // as to obtain a larger value ;
        }else{
            end -- ;
        }
        count ++ ; 
    }

return count ; 

        
    }
}