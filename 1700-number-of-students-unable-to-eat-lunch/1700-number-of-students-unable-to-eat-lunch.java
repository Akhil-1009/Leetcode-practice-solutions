class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int countzero=0;
        int countone=0;
        for(int i=0;i<students.length;i++)
        {
            if(students[i]==1)
                countone++;
            else
                countzero++;
        }
        int i=0;
        Deque<Integer> q=new LinkedList();
        for(int j=0;j<students.length;j++)
        {
                q.offerLast(students[j]);
        }
        while(q.size()!=0)
        {
            if(sandwiches[i]==0)
            {
                if(q.peek()==0)
                {
                    q.pollFirst();
                    i++;
                    countzero--;
                }
                else{
                    if(countzero==0)
                    {
                        return q.size();
                    }
                    q.offerLast(q.pollFirst());
                }
            }
            else{
                
                if(q.peek()==1)
                {
                    q.pollFirst();
                    i++;
                    countone--;
                }
                else{
                    if(countone==0)
                    {
                        return q.size();
                    }
                    q.offerLast(q.pollFirst());
                }
            }
        }
        return 0;
    }
}