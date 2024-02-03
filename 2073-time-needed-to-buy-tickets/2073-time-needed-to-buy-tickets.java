class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count=0;
         int i=0;
         while(tickets[k]>0)
         {
             if(tickets[i]==0)
             {   i=(i+1)%tickets.length;
                 continue;
                 
             }
             tickets[i]--;
             count++;
             if(tickets[k]==0) return count;
             i++;
            if(i==tickets.length) i=0;
         }
        return count;
             
    }
}