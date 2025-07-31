
        
        // run two for loop and them in the hashmap and if find maximum and minumu value and 
        //subtract those values to get the 


        import java.util.HashMap;
import java.util.Map;

class Solution {
    public int beautySum(String s) {
        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            Map<Character, Integer> freqMap = new HashMap<>();
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);

                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int count : freqMap.values()) {
                    maxFreq = Math.max(maxFreq, count);
                    minFreq = Math.min(minFreq, count);
                }

                total += maxFreq - minFreq;
            }
        }

        return total;
    }
}
//Outer Loop → i = 0
//Inner Loop → j = 0
//ch = 'a'

//freqMap = {a: 1}

//Find max/min:

//Counts = [1]

//maxFreq = 1, minFreq = 1

//beauty = 1 - 1 = 0

///total = 0 + 0 = 0

//Inner Loop → j = 1
//ch = 'a'

//freqMap = {a: 2}

//Counts = [2]

//maxFreq = 2, minFreq = 2

//beauty = 2 - 2 = 0

//total = 0 + 0 = 0

//Inner Loop → j = 2
//ch = 'b'

//freqMap = {a: 2, b: 1}

//Counts = [2, 1]

//maxFreq = 2, minFreq = 1

//beauty = 2 - 1 = 1

//total = 0 + 1 = 1

//Outer Loop → i = 1
//Inner Loop → j = 1
//freqMap = {a: 1}

///Counts = [1]

//beauty = 0

//total = 1 + 0 = 1

//Inner Loop → j = 2
//Add 'b'

//f//reqMap = {a: 1, b: 1}

//Counts = [1, 1]

//beauty = 1 - 1 = 0

//to/tal = 1 + 0 = 1

//Outer Loop → i = 2
//Inner Loop → j = 2
//freqMap = {b: 1}

//Counts = [1]

//beauty = 0

//total = 1 + 0 = 1

//total = 1

//\U0001f4cc Substrings & Beauties
//"a" → 0

//"aa" → 0

//"aab" → 1

//"a" (index 1) → 0

//"ab" → 0

//"b" → 0

//So, the output = 1 ✅.













    