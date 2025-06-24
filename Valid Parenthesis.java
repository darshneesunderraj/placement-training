import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> brack = new HashMap<>();
        brack.put(')','(');
        brack.put(']','[');
        brack.put('}','{');
        
        for( char c : s.toCharArray()){
            if (brack.containsKey(c)){
                char top = stack.isEmpty() ? '#' : stack.pop();
                if(top!=brack.get(c)){
                    return false;
                }
                } else {
                    stack.push(c);
                }
            } return stack.isEmpty();
        } 
    }
