 class Solution {
    public int maxProfit(int[] p) {
        int mp = 0, cp = p[0];
        for(int i = 1; i < p.length; i++){
            if(cp < p[i]) mp += p[i] - cp;
            cp = p[i];
        }
        return mp;
    }
}