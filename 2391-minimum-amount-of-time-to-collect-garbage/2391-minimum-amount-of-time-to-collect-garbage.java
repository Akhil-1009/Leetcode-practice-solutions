 class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int mEnd = findEnd(garbage, 'M');
        int pEnd = findEnd(garbage, 'P');
        int gEnd = findEnd(garbage, 'G');

        int mTimes = 0;
        int pTimes = 0;
        int gTimes = 0;

        boolean mMoving = true;
        boolean pMoving = true;
        boolean gMoving = true;

        for(int i=0; i<garbage.length; i++){
            if(i>=mEnd) mMoving = false;
            if(i>=pEnd) pMoving = false;
            if(i>=gEnd) gMoving = false;

            for(int j=0; j<garbage[i].length(); j++){
                if(garbage[i].charAt(j)=='M') mTimes++;
                else if(garbage[i].charAt(j)=='P') pTimes++;
                else if(garbage[i].charAt(j)=='G') gTimes++;
            }

            if(i!=garbage.length-1){
                if(mMoving) mTimes += travel[i];
                if(pMoving) pTimes += travel[i];
                if(gMoving) gTimes += travel[i];
            }
        }
        return mTimes+ pTimes + gTimes;
    }

    private int findEnd(String[] garbage, char c){
        int end = garbage.length-1;
        for(int i = garbage.length-1; i>=0; i--){
            if(garbage[i].indexOf(c)>=0){
                break;
            }else{
                end--;
            }
        }
        return end;
    }
}