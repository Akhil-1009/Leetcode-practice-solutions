class Solution {
    public double averageWaitingTime(int[][] customers) {
        int currenttime=customers[0][0];
        double totalsum=0;
        for(int i=0;i<customers.length;i++)
        {   if(currenttime<customers[i][0])
        {
            currenttime=customers[i][0];
        }
            currenttime+=customers[i][1];
            totalsum=totalsum+(currenttime-customers[i][0]);
        }
        double ans=totalsum/customers.length;
        return ans;
    }
}