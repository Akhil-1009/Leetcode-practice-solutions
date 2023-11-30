 import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        int len = s.length();
         
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            boolean b=true;
            if(c=='{' || c=='('|| c=='['){
                stack.push(c);
                b=false;
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                 
                stack.pop();

            }
            else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                 
                stack.pop();
            }
            else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                
                stack.pop();
            }
            else if(b){
                return false;
            }
        }
         
        return stack.isEmpty();
    }
}