class Solution {
    public int tribonacci(int n) {
       // difficult to solve this question using recurssion we will solve this using recurssions 
       if(n == 0){
        return 0 ;

       }else if(n==1 || n==2){
        return 1;
       }else{

      int   firstTerm = 0;
      int   secondTerm = 1;
      int   thirdTerm = 1;


        for(int i = 1 ; i<= n ; i++){// this loop will run from i = 1;
 
        int fourthTerm = firstTerm + secondTerm + thirdTerm;
        firstTerm  = secondTerm ;
        secondTerm = thirdTerm ; 
        thirdTerm = fourthTerm ;


       }
       return firstTerm;
       }
    }
}
// in nth fibonacci series int firstterm = 0; int second term = 1; third term is the sum of both the first and second number and there will be a for loop running from for(int i = 1 ; i <=n i++)
       
       