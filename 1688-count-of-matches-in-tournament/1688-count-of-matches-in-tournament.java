class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int team=n;
        while(team!=1)
        {
            if(team%2==0)
            {
                matches+=team/2;
                team=team/2;
            }
            else{
                matches+=(team-1)/2;
                team=(team-1)/2+1;
            }
        }
        return matches;
    }
}