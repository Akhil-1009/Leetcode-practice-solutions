 class Solution {
    public String digitSum(String s, int k) {
        int i=0;
        while(s.length()>k){
            i=0;
            String ans="";
            while(i<s.length()){
                if(i+k>s.length()){
                    ans+=find(s.substring(i,s.length()));
                }
                else{
                    ans+=find(s.substring(i,i+k));
                }  
                i+=k;
            }
            s=ans;
        }
        return s;
    }
    public String find(String s){
        int i=0;
        int sum=0;
        while(i<s.length()){
            sum+=s.charAt(i)-'0';
            i++;
        }
        return String.valueOf(sum);
    }
}