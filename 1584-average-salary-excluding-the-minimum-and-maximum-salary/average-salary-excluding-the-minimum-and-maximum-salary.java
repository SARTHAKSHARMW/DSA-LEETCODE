 // super easy find max and min and the remaining terms excluding max and min calcualte their average ; 
    // take three variables max min and sum and compare max min with the next values
    // then  
    
    // now we have to calculate remaining numbers and divide by n-2 ; 
    class Solution {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        int sum = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] > max) {
                max = salary[i];
            }
            if (salary[i] < min) {
                min = salary[i];
            }
            sum += salary[i];
        }

        // Subtract max and min from total sum after loop
        sum = sum - max - min;

        // Compute average
        double ans = (double) sum / (salary.length - 2);
        return ans;
    }
}


    


   