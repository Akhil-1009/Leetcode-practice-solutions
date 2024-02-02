class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> l=new ArrayList<Integer>();
        
        for(int i=1;i<9;i++)
        {   int num=i;
            for(int j=i+1;j<=9;j++)
            {
                num=num*10+j;
                if(num>=low&&num<=high)
                {
                    l.add(num);
                }
                else if(num>high)
                {
                    break;
                }
            }
        }
        Collections.sort(l);
        return l;
    }
}