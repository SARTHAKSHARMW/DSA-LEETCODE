//class Solution {
 //   public int trap(int[] height) {
        // so in tapping rain water we have to find the left max and right max and after that we need to find the minimum of left and right max and we have to add ans = ans + min(of both the max)

     //   int  n  = height.length ; 
        

      //  int [] leftMax = new int[n];
        // initially 
       // leftMax[0] = height[0] ; // intilally the postion of the left maximum side and 

       // for(int i = 1 ;i <=  n ; i++){ // this loop runs from i = 1 ; now 
          //  leftMax[i] = Math.max(leftMax[i-1] , height[i]) ;

            // it will compare the i - 1 and i element which element would be greater wiill be the max





       // }
      //  int []rightMax = new int[n] ;

        //rightMax[n -1] = height[n-1] ;

      //  for(int i = n -2 ; i>= 1 ; i--){ // reverse the loop 
         //   rightMax[i] = Math.max(rightMax[i+1], height[i]) ;
            // it will compare the i + 1 element with ith element and solve 
        //}
       // int ans = 0; 
       // for(int i = 0 ; i < n ; i++){

       // ans = ans + Math.min(leftMax[i] , rightMax[i] - height[i]) ;
       // }

      //  return ans ;


        
    ////}
//}

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }
}
