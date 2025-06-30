class Solution {
    public int bulbSwitch(int n) {
        // in bulb switcher question intially the bulbs are off 
        // so the n variables switches on the n mutiple bulb for example when n = 1 it will switch off all bulbs and n = 2 it will switch off all the multiples of 2 bulb like bulb 2 4 6 8 10 .... at n = 3 it will switch of 3 , 6, 9,12 etc 
// so intially it is on then off then on anf off but we notice that bulb 1 4 9 16 that are perfect square the bulb are always on 
// basically perfect p number code 
int count = 0;
for(int i = 1 ; i*i <= n ; i++){
count ++ ;
}
return count ;
    }
}
// prime no code 
// isprime 
//if(n % 1 ==0){
    //return false
    // else isprime

