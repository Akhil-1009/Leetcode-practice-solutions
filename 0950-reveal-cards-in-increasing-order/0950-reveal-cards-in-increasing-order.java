class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> q=new LinkedList<Integer>();
        int ans[]= new int[deck.length];
        for(int i=0;i<deck.length;i++)
        {
            q.offerLast(i);
        }
        int flip=0;
        int chance=0;
        while(q.size()>0)
        {
            if(flip==0)
            {
                ans[q.pollFirst()]=deck[chance++];
                flip=1;
            }
            else{
                q.offerLast(q.pollFirst());
                flip=0;
            }
             
        }
        return ans;
    }
}