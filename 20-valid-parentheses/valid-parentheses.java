//class Solution {
    //public boolean isValid(String s) {
        
  //  }
//}
//hence the basic logic is just if the c an opening paranthesis push it into the stack and if you get an and get an closing paranthesis then pop from the stack else return false ; 
//means that if(ch == '(' != ')')
//return false ; 
//}else{
  //  pop(ch); 

//}
//or something like this char top = stack.pop();

//if (c == ')' && top != '(') {
  //  return false;
//} else if (c == '}' && top != '{') {
  //  return false;
//} else if (c == ']' && top != '[') {
  //  return false;
//}


import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If opening bracket, push
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing bracket, check stack
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
